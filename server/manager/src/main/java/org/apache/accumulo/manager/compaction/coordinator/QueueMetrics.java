/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.accumulo.manager.compaction.coordinator;

import static org.apache.accumulo.core.metrics.Metric.COMPACTOR_JOB_PRIORITY_QUEUES;
import static org.apache.accumulo.core.metrics.Metric.COMPACTOR_JOB_PRIORITY_QUEUE_JOBS_DEQUEUED;
import static org.apache.accumulo.core.metrics.Metric.COMPACTOR_JOB_PRIORITY_QUEUE_JOBS_PRIORITY;
import static org.apache.accumulo.core.metrics.Metric.COMPACTOR_JOB_PRIORITY_QUEUE_JOBS_QUEUED;
import static org.apache.accumulo.core.metrics.Metric.COMPACTOR_JOB_PRIORITY_QUEUE_JOBS_REJECTED;
import static org.apache.accumulo.core.metrics.Metric.COMPACTOR_JOB_PRIORITY_QUEUE_LENGTH;
import static org.apache.accumulo.core.metrics.MetricsUtil.formatString;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.apache.accumulo.core.metrics.MetricsProducer;
import org.apache.accumulo.core.spi.compaction.CompactorGroupId;
import org.apache.accumulo.core.util.threads.ThreadPools;
import org.apache.accumulo.manager.compaction.queue.CompactionJobPriorityQueue;
import org.apache.accumulo.manager.compaction.queue.CompactionJobQueues;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;

import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Tag;

public class QueueMetrics implements MetricsProducer {

  private static class QueueMeters {
    private final Gauge length;
    private final Gauge jobsQueued;
    private final Gauge jobsDequeued;
    private final Gauge jobsRejected;
    private final Gauge jobsLowestPriority;

    public QueueMeters(MeterRegistry meterRegistry, CompactorGroupId cgid,
        CompactionJobPriorityQueue queue) {
      var queueId = formatString(cgid.canonical());

      length =
          Gauge.builder(COMPACTOR_JOB_PRIORITY_QUEUE_LENGTH.getName(), queue, q -> q.getMaxSize())
              .description("Length of priority queues").tags(List.of(Tag.of("queue.id", queueId)))
              .register(meterRegistry);

      jobsQueued = Gauge
          .builder(COMPACTOR_JOB_PRIORITY_QUEUE_JOBS_QUEUED.getName(), queue,
              q -> q.getQueuedJobs())
          .description("Count of queued jobs").tags(List.of(Tag.of("queue.id", queueId)))
          .register(meterRegistry);

      jobsDequeued = Gauge
          .builder(COMPACTOR_JOB_PRIORITY_QUEUE_JOBS_DEQUEUED.getName(), queue,
              q -> q.getDequeuedJobs())
          .description("Count of jobs dequeued").tags(List.of(Tag.of("queue.id", queueId)))
          .register(meterRegistry);

      jobsRejected = Gauge
          .builder(COMPACTOR_JOB_PRIORITY_QUEUE_JOBS_REJECTED.getName(), queue,
              q -> q.getRejectedJobs())
          .description("Count of rejected jobs").tags(List.of(Tag.of("queue.id", queueId)))
          .register(meterRegistry);

      jobsLowestPriority = Gauge
          .builder(COMPACTOR_JOB_PRIORITY_QUEUE_JOBS_PRIORITY.getName(), queue,
              q -> q.getLowestPriority())
          .description("Lowest priority queued job").tags(List.of(Tag.of("queue.id", queueId)))
          .register(meterRegistry);
    }

    private void removeMeters(MeterRegistry registry) {
      registry.remove(length);
      registry.remove(jobsQueued);
      registry.remove(jobsDequeued);
      registry.remove(jobsRejected);
      registry.remove(jobsLowestPriority);
    }
  }

  private static final Logger LOG = LoggerFactory.getLogger(QueueMetrics.class);
  private static final long DEFAULT_MIN_REFRESH_DELAY = TimeUnit.SECONDS.toMillis(5);
  private volatile MeterRegistry meterRegistry = null;
  private final CompactionJobQueues compactionJobQueues;
  private final Map<CompactorGroupId,QueueMeters> perQueueMetrics = new HashMap<>();
  private Gauge queueCountMeter = null;

  public QueueMetrics(CompactionJobQueues compactionJobQueues) {
    this.compactionJobQueues = compactionJobQueues;
    ScheduledExecutorService scheduler =
        ThreadPools.getServerThreadPools().createScheduledExecutorService(1, "queueMetricsPoller");
    Runtime.getRuntime().addShutdownHook(new Thread(scheduler::shutdownNow));
    ThreadPools.watchNonCriticalScheduledTask(scheduler.scheduleAtFixedRate(this::update,
        DEFAULT_MIN_REFRESH_DELAY, DEFAULT_MIN_REFRESH_DELAY, TimeUnit.MILLISECONDS));
  }

  public void update() {

    // read the volatile variable once so the rest of the method has consistent view
    var localRegistry = meterRegistry;

    if (queueCountMeter == null) {
      queueCountMeter = Gauge
          .builder(COMPACTOR_JOB_PRIORITY_QUEUES.getName(), compactionJobQueues,
              CompactionJobQueues::getQueueCount)
          .description("Number of current Queues").register(localRegistry);
    }
    LOG.debug("update - cjq queues: {}", compactionJobQueues.getQueueIds());

    Set<CompactorGroupId> definedQueues = compactionJobQueues.getQueueIds();
    LOG.debug("update - defined queues: {}", definedQueues);

    // Copy the keySet into a new Set so that changes to perQueueMetrics
    // don't affect the collection
    Set<CompactorGroupId> queuesWithMetrics = new HashSet<>(perQueueMetrics.keySet());
    LOG.debug("update - queues with metrics: {}", queuesWithMetrics);

    SetView<CompactorGroupId> queuesWithoutMetrics =
        Sets.difference(definedQueues, queuesWithMetrics);
    queuesWithoutMetrics.forEach(q -> {
      LOG.debug("update - creating meters for queue: {}", q);
      perQueueMetrics.put(q, new QueueMeters(localRegistry, q, compactionJobQueues.getQueue(q)));
    });

    SetView<CompactorGroupId> metricsWithoutQueues =
        Sets.difference(queuesWithMetrics, definedQueues);
    metricsWithoutQueues.forEach(q -> {
      LOG.debug("update - removing meters for queue: {}", q);
      perQueueMetrics.get(q).removeMeters(localRegistry);
      perQueueMetrics.remove(q);
    });

  }

  @Override
  public void registerMetrics(MeterRegistry registry) {
    this.meterRegistry = registry;
  }
}
