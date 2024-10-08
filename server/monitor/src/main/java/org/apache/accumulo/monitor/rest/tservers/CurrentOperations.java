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
package org.apache.accumulo.monitor.rest.tservers;

import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.apache.accumulo.core.data.TableId;
import org.apache.accumulo.monitor.util.JaxbAbstractIdSerializer;

/**
 * Generates the current operations for the tablet
 *
 * @since 2.0.0
 */
public class CurrentOperations {

  // Variable names become JSON keys
  public String name;
  public String tablet;

  @XmlJavaTypeAdapter(JaxbAbstractIdSerializer.class)
  public TableId tableID;

  public long entries;
  public double ingest;
  public double query;
  public Double minorStdDev;
  public Double minorAvgES;
  public Double minorAvg;

  public CurrentOperations() {}

  /**
   * Stores the current operations of the tablet
   *
   * @param name Table name
   * @param tableId Table ID
   * @param tablet Tablet string
   * @param entries Number of entries
   * @param ingest Number of ingest
   * @param query Number of queries
   * @param minorAvg Minor compaction average
   * @param minorStdDev Minor compaction standard deviation
   * @param minorAvgES Minor compaction average ES
   */
  public CurrentOperations(String name, TableId tableId, String tablet, long entries, double ingest,
      double query, Double minorAvg, Double minorStdDev, Double minorAvgES) {
    this.name = name;
    this.tableID = tableId;
    this.tablet = tablet;
    this.entries = entries;
    this.ingest = ingest;
    this.query = query;
    this.minorStdDev = minorStdDev;
    this.minorAvgES = minorAvgES;
    this.minorAvg = minorAvg;
  }
}
