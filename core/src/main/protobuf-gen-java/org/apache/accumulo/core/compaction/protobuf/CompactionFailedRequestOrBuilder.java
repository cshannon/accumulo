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
// source: compaction-coordinator.proto

// Protobuf Java Version: 3.25.3
package org.apache.accumulo.core.compaction.protobuf;

public interface CompactionFailedRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:compaction_coordinator.CompactionFailedRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.client.ProtoTInfo ptinfo = 1;</code>
   * @return Whether the ptinfo field is set.
   */
  boolean hasPtinfo();
  /**
   * <code>.client.ProtoTInfo ptinfo = 1;</code>
   * @return The ptinfo.
   */
  org.apache.accumulo.core.compaction.protobuf.ProtoTInfo getPtinfo();
  /**
   * <code>.client.ProtoTInfo ptinfo = 1;</code>
   */
  org.apache.accumulo.core.compaction.protobuf.ProtoTInfoOrBuilder getPtinfoOrBuilder();

  /**
   * <code>.security.PCredentials credentials = 2;</code>
   * @return Whether the credentials field is set.
   */
  boolean hasCredentials();
  /**
   * <code>.security.PCredentials credentials = 2;</code>
   * @return The credentials.
   */
  org.apache.accumulo.core.compaction.protobuf.PCredentials getCredentials();
  /**
   * <code>.security.PCredentials credentials = 2;</code>
   */
  org.apache.accumulo.core.compaction.protobuf.PCredentialsOrBuilder getCredentialsOrBuilder();

  /**
   * <code>string externalCompactionId = 3;</code>
   * @return The externalCompactionId.
   */
  java.lang.String getExternalCompactionId();
  /**
   * <code>string externalCompactionId = 3;</code>
   * @return The bytes for externalCompactionId.
   */
  com.google.protobuf.ByteString
      getExternalCompactionIdBytes();

  /**
   * <code>.data.PKeyExtent extent = 4;</code>
   * @return Whether the extent field is set.
   */
  boolean hasExtent();
  /**
   * <code>.data.PKeyExtent extent = 4;</code>
   * @return The extent.
   */
  org.apache.accumulo.core.compaction.protobuf.PKeyExtent getExtent();
  /**
   * <code>.data.PKeyExtent extent = 4;</code>
   */
  org.apache.accumulo.core.compaction.protobuf.PKeyExtentOrBuilder getExtentOrBuilder();
}
