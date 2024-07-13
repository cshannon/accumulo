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
// source: manager.proto

// Protobuf Java Version: 3.25.3
package org.apache.accumulo.core.compaction.protobuf;

public interface PFateIdOrBuilder extends
    // @@protoc_insertion_point(interface_extends:manager.PFateId)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.manager.PFateInstanceType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.manager.PFateInstanceType type = 1;</code>
   * @return The type.
   */
  org.apache.accumulo.core.compaction.protobuf.PFateInstanceType getType();

  /**
   * <code>string txUUIDStr = 2;</code>
   * @return The txUUIDStr.
   */
  java.lang.String getTxUUIDStr();
  /**
   * <code>string txUUIDStr = 2;</code>
   * @return The bytes for txUUIDStr.
   */
  com.google.protobuf.ByteString
      getTxUUIDStrBytes();
}