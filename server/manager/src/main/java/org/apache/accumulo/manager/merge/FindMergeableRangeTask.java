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
package org.apache.accumulo.manager.merge;

import static org.apache.accumulo.core.metadata.schema.TabletMetadata.ColumnType.FILES;
import static org.apache.accumulo.core.metadata.schema.TabletMetadata.ColumnType.MERGEABILITY;
import static org.apache.accumulo.core.metadata.schema.TabletMetadata.ColumnType.PREV_ROW;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

import org.apache.accumulo.core.clientImpl.thrift.TableOperation;
import org.apache.accumulo.core.conf.Property;
import org.apache.accumulo.core.data.NamespaceId;
import org.apache.accumulo.core.data.TableId;
import org.apache.accumulo.core.fate.Fate.FateOperation;
import org.apache.accumulo.core.fate.FateInstanceType;
import org.apache.accumulo.core.metadata.schema.TabletMetadata;
import org.apache.accumulo.core.util.time.SteadyTime;
import org.apache.accumulo.manager.Manager;
import org.apache.accumulo.manager.tableOps.TraceRepo;
import org.apache.accumulo.manager.tableOps.merge.MergeInfo;
import org.apache.accumulo.manager.tableOps.merge.TableRangeOp;
import org.apache.commons.lang3.StringUtils;
import org.apache.hadoop.io.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FindMergeableRangeTask implements Runnable {

  private static final Logger log = LoggerFactory.getLogger(FindMergeableRangeTask.class);
  private final Manager manager;

  public FindMergeableRangeTask(Manager manager) {
    this.manager = Objects.requireNonNull(manager);
  }

  @Override
  public void run() {
    var context = manager.getContext();
    Map<TableId,String> tables = context.getTableIdToNameMap();

    for (Entry<TableId,String> table : tables.entrySet()) {
      TableId tableId = table.getKey();
      String tableName = table.getValue();

      long maxFileCount =
          context.getTableConfiguration(tableId).getCount(Property.TABLE_MERGE_FILE_MAX);
      long threshold =
          context.getTableConfiguration(tableId).getAsBytes(Property.TABLE_SPLIT_THRESHOLD);
      double mergeabilityThreshold = .25;
      long maxTotalSize = (long) (threshold * mergeabilityThreshold);

      try {
        NamespaceId namespaceId = context.getNamespaceId(tableId);
        var type = FateInstanceType.fromTableId(tableId);

        try (var tablets = context.getAmple().readTablets().forTable(tableId)
            .fetch(PREV_ROW, FILES, MERGEABILITY).checkConsistency().build()) {

          final MergeableRange current =
              new MergeableRange(manager.getSteadyTime(), maxFileCount, maxTotalSize);

          for (var tabletMetadata : tablets) {

            if (!current.add(tabletMetadata)) {
              submit(current, type, table, namespaceId);
              current.resetAndAdd(tabletMetadata);
            }

            // log.debug("{} found {} files in the merge range, maxFiles is {}", fateId,
            // totalFiles,
            // maxFiles);
            // mergeable = false;
            // }
          }

          submit(current, type, table, namespaceId);
        }

      } catch (Exception e) {
        log.error("Failed to generate system merges for {}", tableName, e);
      }
    }

  }

  void submit(MergeableRange range, FateInstanceType type, Entry<TableId,String> table,
      NamespaceId namespaceId) {
    if (range.tabletCount < 2) {
      return;
    }

    TableId tableId = table.getKey();
    String tableName = table.getValue();

    String startRowStr = StringUtils.defaultIfBlank(range.startRow.toString(), "-inf");
    String endRowStr = StringUtils.defaultIfBlank(range.startRow.toString(), "+inf");
    log.debug("Creating merge op: {} from startRow: {} to endRow: {}", tableId, startRowStr,
        endRowStr);
    var fateId = manager.fate(type).startTransaction();
    String goalMessage = TableOperation.MERGE + " Merge table " + tableName + "(" + tableId
        + ") splits from " + startRowStr + " to " + endRowStr;

    manager.fate(type).seedTransaction(FateOperation.SYSTEM_MERGE, fateId,
        new TraceRepo<>(new TableRangeOp(MergeInfo.Operation.MERGE, namespaceId, tableId,
            range.startRow, range.endRow)),
        true, goalMessage);
  }

  static class MergeableRange {
    final SteadyTime currentTime;
    final long maxFileCount;
    final long maxTotalSize;

    Text startRow;
    Text endRow;
    int tabletCount;
    long totalFileCount = 0;
    long totalFileSize = 0;

    MergeableRange(SteadyTime currentTime, long maxFileCount, long maxTotalSize) {
      this.currentTime = currentTime;
      this.maxFileCount = maxFileCount;
      this.maxTotalSize = maxTotalSize;
    }

    boolean add(TabletMetadata tm) {
      if (validate(tm)) {
        tabletCount++;
        if (startRow == null) {
          startRow = tm.getPrevEndRow();
        } else {
          endRow = tm.getEndRow();
        }
        totalFileCount += tm.getFiles().size();
        totalFileSize += tm.getFileSize();
        return true;
      }
      return false;
    }

    private boolean validate(TabletMetadata tm) {
      if (!tm.getTabletMergeability().isMergeable(currentTime)) {
        return false;
      }

      if (totalFileCount + tm.getFiles().size() > maxFileCount) {
        return false;
      }

      return totalFileSize + tm.getFileSize() > maxTotalSize;
    }

    void resetAndAdd(TabletMetadata tm) {
      reset();
      add(tm);
    }

    void reset() {
      startRow = null;
      endRow = null;
      tabletCount = 0;
      totalFileCount = 0;
      totalFileSize = 0;
    }
  }
}
