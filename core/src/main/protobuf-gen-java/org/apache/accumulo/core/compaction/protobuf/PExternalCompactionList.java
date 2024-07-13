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

/**
 * Protobuf type {@code compaction_coordinator.PExternalCompactionList}
 */
public final class PExternalCompactionList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:compaction_coordinator.PExternalCompactionList)
    PExternalCompactionListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PExternalCompactionList.newBuilder() to construct.
  private PExternalCompactionList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PExternalCompactionList() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PExternalCompactionList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.accumulo.core.compaction.protobuf.CompactionCoordinatorServiceProto.internal_static_compaction_coordinator_PExternalCompactionList_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
      int number) {
    switch (number) {
      case 1:
        return internalGetCompactions();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.accumulo.core.compaction.protobuf.CompactionCoordinatorServiceProto.internal_static_compaction_coordinator_PExternalCompactionList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.accumulo.core.compaction.protobuf.PExternalCompactionList.class, org.apache.accumulo.core.compaction.protobuf.PExternalCompactionList.Builder.class);
  }

  public static final int COMPACTIONS_FIELD_NUMBER = 1;
  private static final class CompactionsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, org.apache.accumulo.core.compaction.protobuf.PExternalCompaction> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, org.apache.accumulo.core.compaction.protobuf.PExternalCompaction>newDefaultInstance(
                org.apache.accumulo.core.compaction.protobuf.CompactionCoordinatorServiceProto.internal_static_compaction_coordinator_PExternalCompactionList_CompactionsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                org.apache.accumulo.core.compaction.protobuf.PExternalCompaction.getDefaultInstance());
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, org.apache.accumulo.core.compaction.protobuf.PExternalCompaction> compactions_;
  private com.google.protobuf.MapField<java.lang.String, org.apache.accumulo.core.compaction.protobuf.PExternalCompaction>
  internalGetCompactions() {
    if (compactions_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          CompactionsDefaultEntryHolder.defaultEntry);
    }
    return compactions_;
  }
  public int getCompactionsCount() {
    return internalGetCompactions().getMap().size();
  }
  /**
   * <code>map&lt;string, .compaction_coordinator.PExternalCompaction&gt; compactions = 1;</code>
   */
  @java.lang.Override
  public boolean containsCompactions(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetCompactions().getMap().containsKey(key);
  }
  /**
   * Use {@link #getCompactionsMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, org.apache.accumulo.core.compaction.protobuf.PExternalCompaction> getCompactions() {
    return getCompactionsMap();
  }
  /**
   * <code>map&lt;string, .compaction_coordinator.PExternalCompaction&gt; compactions = 1;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, org.apache.accumulo.core.compaction.protobuf.PExternalCompaction> getCompactionsMap() {
    return internalGetCompactions().getMap();
  }
  /**
   * <code>map&lt;string, .compaction_coordinator.PExternalCompaction&gt; compactions = 1;</code>
   */
  @java.lang.Override
  public /* nullable */
org.apache.accumulo.core.compaction.protobuf.PExternalCompaction getCompactionsOrDefault(
      java.lang.String key,
      /* nullable */
org.apache.accumulo.core.compaction.protobuf.PExternalCompaction defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, org.apache.accumulo.core.compaction.protobuf.PExternalCompaction> map =
        internalGetCompactions().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, .compaction_coordinator.PExternalCompaction&gt; compactions = 1;</code>
   */
  @java.lang.Override
  public org.apache.accumulo.core.compaction.protobuf.PExternalCompaction getCompactionsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, org.apache.accumulo.core.compaction.protobuf.PExternalCompaction> map =
        internalGetCompactions().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetCompactions(),
        CompactionsDefaultEntryHolder.defaultEntry,
        1);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, org.apache.accumulo.core.compaction.protobuf.PExternalCompaction> entry
         : internalGetCompactions().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, org.apache.accumulo.core.compaction.protobuf.PExternalCompaction>
      compactions__ = CompactionsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, compactions__);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.apache.accumulo.core.compaction.protobuf.PExternalCompactionList)) {
      return super.equals(obj);
    }
    org.apache.accumulo.core.compaction.protobuf.PExternalCompactionList other = (org.apache.accumulo.core.compaction.protobuf.PExternalCompactionList) obj;

    if (!internalGetCompactions().equals(
        other.internalGetCompactions())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (!internalGetCompactions().getMap().isEmpty()) {
      hash = (37 * hash) + COMPACTIONS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetCompactions().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.accumulo.core.compaction.protobuf.PExternalCompactionList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.accumulo.core.compaction.protobuf.PExternalCompactionList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.accumulo.core.compaction.protobuf.PExternalCompactionList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.accumulo.core.compaction.protobuf.PExternalCompactionList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.accumulo.core.compaction.protobuf.PExternalCompactionList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.accumulo.core.compaction.protobuf.PExternalCompactionList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.accumulo.core.compaction.protobuf.PExternalCompactionList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.accumulo.core.compaction.protobuf.PExternalCompactionList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.apache.accumulo.core.compaction.protobuf.PExternalCompactionList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.apache.accumulo.core.compaction.protobuf.PExternalCompactionList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.accumulo.core.compaction.protobuf.PExternalCompactionList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.accumulo.core.compaction.protobuf.PExternalCompactionList parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.apache.accumulo.core.compaction.protobuf.PExternalCompactionList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code compaction_coordinator.PExternalCompactionList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:compaction_coordinator.PExternalCompactionList)
      org.apache.accumulo.core.compaction.protobuf.PExternalCompactionListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.accumulo.core.compaction.protobuf.CompactionCoordinatorServiceProto.internal_static_compaction_coordinator_PExternalCompactionList_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 1:
          return internalGetCompactions();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableCompactions();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.accumulo.core.compaction.protobuf.CompactionCoordinatorServiceProto.internal_static_compaction_coordinator_PExternalCompactionList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.accumulo.core.compaction.protobuf.PExternalCompactionList.class, org.apache.accumulo.core.compaction.protobuf.PExternalCompactionList.Builder.class);
    }

    // Construct using org.apache.accumulo.core.compaction.protobuf.PExternalCompactionList.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      internalGetMutableCompactions().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.accumulo.core.compaction.protobuf.CompactionCoordinatorServiceProto.internal_static_compaction_coordinator_PExternalCompactionList_descriptor;
    }

    @java.lang.Override
    public org.apache.accumulo.core.compaction.protobuf.PExternalCompactionList getDefaultInstanceForType() {
      return org.apache.accumulo.core.compaction.protobuf.PExternalCompactionList.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.accumulo.core.compaction.protobuf.PExternalCompactionList build() {
      org.apache.accumulo.core.compaction.protobuf.PExternalCompactionList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.accumulo.core.compaction.protobuf.PExternalCompactionList buildPartial() {
      org.apache.accumulo.core.compaction.protobuf.PExternalCompactionList result = new org.apache.accumulo.core.compaction.protobuf.PExternalCompactionList(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.apache.accumulo.core.compaction.protobuf.PExternalCompactionList result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.compactions_ = internalGetCompactions().build(CompactionsDefaultEntryHolder.defaultEntry);
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.apache.accumulo.core.compaction.protobuf.PExternalCompactionList) {
        return mergeFrom((org.apache.accumulo.core.compaction.protobuf.PExternalCompactionList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.accumulo.core.compaction.protobuf.PExternalCompactionList other) {
      if (other == org.apache.accumulo.core.compaction.protobuf.PExternalCompactionList.getDefaultInstance()) return this;
      internalGetMutableCompactions().mergeFrom(
          other.internalGetCompactions());
      bitField0_ |= 0x00000001;
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.google.protobuf.MapEntry<java.lang.String, org.apache.accumulo.core.compaction.protobuf.PExternalCompaction>
              compactions__ = input.readMessage(
                  CompactionsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableCompactions().ensureBuilderMap().put(
                  compactions__.getKey(), compactions__.getValue());
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private static final class CompactionsConverter implements com.google.protobuf.MapFieldBuilder.Converter<java.lang.String, org.apache.accumulo.core.compaction.protobuf.PExternalCompactionOrBuilder, org.apache.accumulo.core.compaction.protobuf.PExternalCompaction> {
      @java.lang.Override
      public org.apache.accumulo.core.compaction.protobuf.PExternalCompaction build(org.apache.accumulo.core.compaction.protobuf.PExternalCompactionOrBuilder val) {
        if (val instanceof org.apache.accumulo.core.compaction.protobuf.PExternalCompaction) { return (org.apache.accumulo.core.compaction.protobuf.PExternalCompaction) val; }
        return ((org.apache.accumulo.core.compaction.protobuf.PExternalCompaction.Builder) val).build();
      }

      @java.lang.Override
      public com.google.protobuf.MapEntry<java.lang.String, org.apache.accumulo.core.compaction.protobuf.PExternalCompaction> defaultEntry() {
        return CompactionsDefaultEntryHolder.defaultEntry;
      }
    };
    private static final CompactionsConverter compactionsConverter = new CompactionsConverter();

    private com.google.protobuf.MapFieldBuilder<
        java.lang.String, org.apache.accumulo.core.compaction.protobuf.PExternalCompactionOrBuilder, org.apache.accumulo.core.compaction.protobuf.PExternalCompaction, org.apache.accumulo.core.compaction.protobuf.PExternalCompaction.Builder> compactions_;
    private com.google.protobuf.MapFieldBuilder<java.lang.String, org.apache.accumulo.core.compaction.protobuf.PExternalCompactionOrBuilder, org.apache.accumulo.core.compaction.protobuf.PExternalCompaction, org.apache.accumulo.core.compaction.protobuf.PExternalCompaction.Builder>
        internalGetCompactions() {
      if (compactions_ == null) {
        return new com.google.protobuf.MapFieldBuilder<>(compactionsConverter);
      }
      return compactions_;
    }
    private com.google.protobuf.MapFieldBuilder<java.lang.String, org.apache.accumulo.core.compaction.protobuf.PExternalCompactionOrBuilder, org.apache.accumulo.core.compaction.protobuf.PExternalCompaction, org.apache.accumulo.core.compaction.protobuf.PExternalCompaction.Builder>
        internalGetMutableCompactions() {
      if (compactions_ == null) {
        compactions_ = new com.google.protobuf.MapFieldBuilder<>(compactionsConverter);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return compactions_;
    }
    public int getCompactionsCount() {
      return internalGetCompactions().ensureBuilderMap().size();
    }
    /**
     * <code>map&lt;string, .compaction_coordinator.PExternalCompaction&gt; compactions = 1;</code>
     */
    @java.lang.Override
    public boolean containsCompactions(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetCompactions().ensureBuilderMap().containsKey(key);
    }
    /**
     * Use {@link #getCompactionsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, org.apache.accumulo.core.compaction.protobuf.PExternalCompaction> getCompactions() {
      return getCompactionsMap();
    }
    /**
     * <code>map&lt;string, .compaction_coordinator.PExternalCompaction&gt; compactions = 1;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, org.apache.accumulo.core.compaction.protobuf.PExternalCompaction> getCompactionsMap() {
      return internalGetCompactions().getImmutableMap();
    }
    /**
     * <code>map&lt;string, .compaction_coordinator.PExternalCompaction&gt; compactions = 1;</code>
     */
    @java.lang.Override
    public /* nullable */
org.apache.accumulo.core.compaction.protobuf.PExternalCompaction getCompactionsOrDefault(
        java.lang.String key,
        /* nullable */
org.apache.accumulo.core.compaction.protobuf.PExternalCompaction defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, org.apache.accumulo.core.compaction.protobuf.PExternalCompactionOrBuilder> map = internalGetMutableCompactions().ensureBuilderMap();
      return map.containsKey(key) ? compactionsConverter.build(map.get(key)) : defaultValue;
    }
    /**
     * <code>map&lt;string, .compaction_coordinator.PExternalCompaction&gt; compactions = 1;</code>
     */
    @java.lang.Override
    public org.apache.accumulo.core.compaction.protobuf.PExternalCompaction getCompactionsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, org.apache.accumulo.core.compaction.protobuf.PExternalCompactionOrBuilder> map = internalGetMutableCompactions().ensureBuilderMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return compactionsConverter.build(map.get(key));
    }
    public Builder clearCompactions() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableCompactions().clear();
      return this;
    }
    /**
     * <code>map&lt;string, .compaction_coordinator.PExternalCompaction&gt; compactions = 1;</code>
     */
    public Builder removeCompactions(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableCompactions().ensureBuilderMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, org.apache.accumulo.core.compaction.protobuf.PExternalCompaction>
        getMutableCompactions() {
      bitField0_ |= 0x00000001;
      return internalGetMutableCompactions().ensureMessageMap();
    }
    /**
     * <code>map&lt;string, .compaction_coordinator.PExternalCompaction&gt; compactions = 1;</code>
     */
    public Builder putCompactions(
        java.lang.String key,
        org.apache.accumulo.core.compaction.protobuf.PExternalCompaction value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableCompactions().ensureBuilderMap()
          .put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>map&lt;string, .compaction_coordinator.PExternalCompaction&gt; compactions = 1;</code>
     */
    public Builder putAllCompactions(
        java.util.Map<java.lang.String, org.apache.accumulo.core.compaction.protobuf.PExternalCompaction> values) {
      for (java.util.Map.Entry<java.lang.String, org.apache.accumulo.core.compaction.protobuf.PExternalCompaction> e : values.entrySet()) {
        if (e.getKey() == null || e.getValue() == null) {
          throw new NullPointerException();
        }
      }
      internalGetMutableCompactions().ensureBuilderMap()
          .putAll(values);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>map&lt;string, .compaction_coordinator.PExternalCompaction&gt; compactions = 1;</code>
     */
    public org.apache.accumulo.core.compaction.protobuf.PExternalCompaction.Builder putCompactionsBuilderIfAbsent(
        java.lang.String key) {
      java.util.Map<java.lang.String, org.apache.accumulo.core.compaction.protobuf.PExternalCompactionOrBuilder> builderMap = internalGetMutableCompactions().ensureBuilderMap();
      org.apache.accumulo.core.compaction.protobuf.PExternalCompactionOrBuilder entry = builderMap.get(key);
      if (entry == null) {
        entry = org.apache.accumulo.core.compaction.protobuf.PExternalCompaction.newBuilder();
        builderMap.put(key, entry);
      }
      if (entry instanceof org.apache.accumulo.core.compaction.protobuf.PExternalCompaction) {
        entry = ((org.apache.accumulo.core.compaction.protobuf.PExternalCompaction) entry).toBuilder();
        builderMap.put(key, entry);
      }
      return (org.apache.accumulo.core.compaction.protobuf.PExternalCompaction.Builder) entry;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:compaction_coordinator.PExternalCompactionList)
  }

  // @@protoc_insertion_point(class_scope:compaction_coordinator.PExternalCompactionList)
  private static final org.apache.accumulo.core.compaction.protobuf.PExternalCompactionList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.accumulo.core.compaction.protobuf.PExternalCompactionList();
  }

  public static org.apache.accumulo.core.compaction.protobuf.PExternalCompactionList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PExternalCompactionList>
      PARSER = new com.google.protobuf.AbstractParser<PExternalCompactionList>() {
    @java.lang.Override
    public PExternalCompactionList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<PExternalCompactionList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PExternalCompactionList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.accumulo.core.compaction.protobuf.PExternalCompactionList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

