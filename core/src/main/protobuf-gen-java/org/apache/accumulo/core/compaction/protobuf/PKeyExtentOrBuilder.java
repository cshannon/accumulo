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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: data.proto

// Protobuf Java Version: 3.25.3
package org.apache.accumulo.core.compaction.protobuf;

public interface PKeyExtentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:data.PKeyExtent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes table = 1;</code>
   * @return The table.
   */
  com.google.protobuf.ByteString getTable();

  /**
   * <pre>
   * optional to generate hasEndRow() and hasPrevEndRow() becuase
   * of no nulls in protobuf
   * </pre>
   *
   * <code>optional bytes endRow = 2;</code>
   * @return Whether the endRow field is set.
   */
  boolean hasEndRow();
  /**
   * <pre>
   * optional to generate hasEndRow() and hasPrevEndRow() becuase
   * of no nulls in protobuf
   * </pre>
   *
   * <code>optional bytes endRow = 2;</code>
   * @return The endRow.
   */
  com.google.protobuf.ByteString getEndRow();

  /**
   * <code>optional bytes prevEndRow = 3;</code>
   * @return Whether the prevEndRow field is set.
   */
  boolean hasPrevEndRow();
  /**
   * <code>optional bytes prevEndRow = 3;</code>
   * @return The prevEndRow.
   */
  com.google.protobuf.ByteString getPrevEndRow();
}
