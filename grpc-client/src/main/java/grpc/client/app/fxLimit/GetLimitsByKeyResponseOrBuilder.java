// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fxLimit.proto

package grpc.client.app.fxLimit;

public interface GetLimitsByKeyResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc_limits.GetLimitsByKeyResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .grpc_limits.Limit limits = 1;</code>
   */
  java.util.List<grpc.client.app.fxLimit.Limit> 
      getLimitsList();
  /**
   * <code>repeated .grpc_limits.Limit limits = 1;</code>
   */
  grpc.client.app.fxLimit.Limit getLimits(int index);
  /**
   * <code>repeated .grpc_limits.Limit limits = 1;</code>
   */
  int getLimitsCount();
  /**
   * <code>repeated .grpc_limits.Limit limits = 1;</code>
   */
  java.util.List<? extends grpc.client.app.fxLimit.LimitOrBuilder> 
      getLimitsOrBuilderList();
  /**
   * <code>repeated .grpc_limits.Limit limits = 1;</code>
   */
  grpc.client.app.fxLimit.LimitOrBuilder getLimitsOrBuilder(
      int index);
}