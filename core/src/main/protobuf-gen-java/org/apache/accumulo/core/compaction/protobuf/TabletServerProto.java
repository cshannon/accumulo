// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tabletserver.proto

// Protobuf Java Version: 3.25.3
package org.apache.accumulo.core.compaction.protobuf;

public final class TabletServerProto {
  private TabletServerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tablet_server_PInputFile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tablet_server_PInputFile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tablet_server_PIteratorSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tablet_server_PIteratorSetting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tablet_server_PIteratorSetting_PropertiesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tablet_server_PIteratorSetting_PropertiesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tablet_server_PIteratorConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tablet_server_PIteratorConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022tabletserver.proto\022\rtablet_server\"Y\n\nP" +
      "InputFile\022\031\n\021metadataFileEntry\030\001 \001(\t\022\014\n\004" +
      "size\030\002 \001(\003\022\017\n\007entries\030\003 \001(\003\022\021\n\ttimestamp" +
      "\030\004 \001(\003\"\301\001\n\020PIteratorSetting\022\020\n\010priority\030" +
      "\001 \001(\005\022\014\n\004name\030\002 \001(\t\022\025\n\riteratorClass\030\003 \001" +
      "(\t\022C\n\nproperties\030\004 \003(\0132/.tablet_server.P" +
      "IteratorSetting.PropertiesEntry\0321\n\017Prope" +
      "rtiesEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\002" +
      "8\001\"E\n\017PIteratorConfig\0222\n\titerators\030\001 \003(\013" +
      "2\037.tablet_server.PIteratorSetting*4\n\017PCo" +
      "mpactionKind\022\013\n\007UNKNOWN\020\000\022\n\n\006SYSTEM\020\001\022\010\n" +
      "\004USER\020\002BC\n,org.apache.accumulo.core.comp" +
      "action.protobufB\021TabletServerProtoP\001b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_tablet_server_PInputFile_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tablet_server_PInputFile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tablet_server_PInputFile_descriptor,
        new java.lang.String[] { "MetadataFileEntry", "Size", "Entries", "Timestamp", });
    internal_static_tablet_server_PIteratorSetting_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tablet_server_PIteratorSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tablet_server_PIteratorSetting_descriptor,
        new java.lang.String[] { "Priority", "Name", "IteratorClass", "Properties", });
    internal_static_tablet_server_PIteratorSetting_PropertiesEntry_descriptor =
      internal_static_tablet_server_PIteratorSetting_descriptor.getNestedTypes().get(0);
    internal_static_tablet_server_PIteratorSetting_PropertiesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tablet_server_PIteratorSetting_PropertiesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tablet_server_PIteratorConfig_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tablet_server_PIteratorConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tablet_server_PIteratorConfig_descriptor,
        new java.lang.String[] { "Iterators", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
