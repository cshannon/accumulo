// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: security.proto

// Protobuf Java Version: 3.25.3
package org.apache.accumulo.core.compaction.protobuf;

public final class SecurityProto {
  private SecurityProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_security_PCredentials_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_security_PCredentials_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016security.proto\022\010security\"\252\001\n\014PCredenti" +
      "als\022\026\n\tprincipal\030\001 \001(\tH\000\210\001\001\022\033\n\016tokenClas" +
      "sName\030\002 \001(\tH\001\210\001\001\022\022\n\005token\030\003 \001(\014H\002\210\001\001\022\027\n\n" +
      "instanceId\030\004 \001(\tH\003\210\001\001B\014\n\n_principalB\021\n\017_" +
      "tokenClassNameB\010\n\006_tokenB\r\n\013_instanceIdB" +
      "?\n,org.apache.accumulo.core.compaction.p" +
      "rotobufB\rSecurityProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_security_PCredentials_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_security_PCredentials_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_security_PCredentials_descriptor,
        new java.lang.String[] { "Principal", "TokenClassName", "Token", "InstanceId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
