// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fxLimit.proto

package grpc.client.app.fxLimit;

public interface VersionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc_limits.Version)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string createdBy = 1;</code>
   */
  java.lang.String getCreatedBy();
  /**
   * <code>string createdBy = 1;</code>
   */
  com.google.protobuf.ByteString
      getCreatedByBytes();

  /**
   * <code>.google.protobuf.Timestamp createdAt = 2;</code>
   */
  boolean hasCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp createdAt = 2;</code>
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp createdAt = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <code>string lastUpdatedBy = 3;</code>
   */
  java.lang.String getLastUpdatedBy();
  /**
   * <code>string lastUpdatedBy = 3;</code>
   */
  com.google.protobuf.ByteString
      getLastUpdatedByBytes();

  /**
   * <code>.google.protobuf.Timestamp lastUpdatedAt = 4;</code>
   */
  boolean hasLastUpdatedAt();
  /**
   * <code>.google.protobuf.Timestamp lastUpdatedAt = 4;</code>
   */
  com.google.protobuf.Timestamp getLastUpdatedAt();
  /**
   * <code>.google.protobuf.Timestamp lastUpdatedAt = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastUpdatedAtOrBuilder();

  /**
   * <code>int32 number = 5;</code>
   */
  int getNumber();
}
