package grpc.client.app.fxLimit;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Limit service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.1)",
    comments = "Source: fxLimit.proto")
public final class LimitServiceGrpc {

  private LimitServiceGrpc() {}

  public static final String SERVICE_NAME = "grpc_limits.LimitService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.client.app.fxLimit.GetLimitsByKeyRequest,
      grpc.client.app.fxLimit.GetLimitsByKeyResponse> getGetLimitsByKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLimitsByKey",
      requestType = grpc.client.app.fxLimit.GetLimitsByKeyRequest.class,
      responseType = grpc.client.app.fxLimit.GetLimitsByKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.client.app.fxLimit.GetLimitsByKeyRequest,
      grpc.client.app.fxLimit.GetLimitsByKeyResponse> getGetLimitsByKeyMethod() {
    io.grpc.MethodDescriptor<grpc.client.app.fxLimit.GetLimitsByKeyRequest, grpc.client.app.fxLimit.GetLimitsByKeyResponse> getGetLimitsByKeyMethod;
    if ((getGetLimitsByKeyMethod = LimitServiceGrpc.getGetLimitsByKeyMethod) == null) {
      synchronized (LimitServiceGrpc.class) {
        if ((getGetLimitsByKeyMethod = LimitServiceGrpc.getGetLimitsByKeyMethod) == null) {
          LimitServiceGrpc.getGetLimitsByKeyMethod = getGetLimitsByKeyMethod =
              io.grpc.MethodDescriptor.<grpc.client.app.fxLimit.GetLimitsByKeyRequest, grpc.client.app.fxLimit.GetLimitsByKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLimitsByKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.client.app.fxLimit.GetLimitsByKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.client.app.fxLimit.GetLimitsByKeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LimitServiceMethodDescriptorSupplier("GetLimitsByKey"))
              .build();
        }
      }
    }
    return getGetLimitsByKeyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LimitServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LimitServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LimitServiceStub>() {
        @java.lang.Override
        public LimitServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LimitServiceStub(channel, callOptions);
        }
      };
    return LimitServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LimitServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LimitServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LimitServiceBlockingStub>() {
        @java.lang.Override
        public LimitServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LimitServiceBlockingStub(channel, callOptions);
        }
      };
    return LimitServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LimitServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LimitServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LimitServiceFutureStub>() {
        @java.lang.Override
        public LimitServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LimitServiceFutureStub(channel, callOptions);
        }
      };
    return LimitServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Limit service
   * </pre>
   */
  public static abstract class LimitServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Get limits by key
     * </pre>
     */
    public void getLimitsByKey(grpc.client.app.fxLimit.GetLimitsByKeyRequest request,
        io.grpc.stub.StreamObserver<grpc.client.app.fxLimit.GetLimitsByKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLimitsByKeyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetLimitsByKeyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.client.app.fxLimit.GetLimitsByKeyRequest,
                grpc.client.app.fxLimit.GetLimitsByKeyResponse>(
                  this, METHODID_GET_LIMITS_BY_KEY)))
          .build();
    }
  }

  /**
   * <pre>
   * Limit service
   * </pre>
   */
  public static final class LimitServiceStub extends io.grpc.stub.AbstractAsyncStub<LimitServiceStub> {
    private LimitServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LimitServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LimitServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get limits by key
     * </pre>
     */
    public void getLimitsByKey(grpc.client.app.fxLimit.GetLimitsByKeyRequest request,
        io.grpc.stub.StreamObserver<grpc.client.app.fxLimit.GetLimitsByKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLimitsByKeyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Limit service
   * </pre>
   */
  public static final class LimitServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<LimitServiceBlockingStub> {
    private LimitServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LimitServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LimitServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get limits by key
     * </pre>
     */
    public grpc.client.app.fxLimit.GetLimitsByKeyResponse getLimitsByKey(grpc.client.app.fxLimit.GetLimitsByKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLimitsByKeyMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Limit service
   * </pre>
   */
  public static final class LimitServiceFutureStub extends io.grpc.stub.AbstractFutureStub<LimitServiceFutureStub> {
    private LimitServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LimitServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LimitServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get limits by key
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.client.app.fxLimit.GetLimitsByKeyResponse> getLimitsByKey(
        grpc.client.app.fxLimit.GetLimitsByKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLimitsByKeyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_LIMITS_BY_KEY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LimitServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LimitServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_LIMITS_BY_KEY:
          serviceImpl.getLimitsByKey((grpc.client.app.fxLimit.GetLimitsByKeyRequest) request,
              (io.grpc.stub.StreamObserver<grpc.client.app.fxLimit.GetLimitsByKeyResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class LimitServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LimitServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.client.app.fxLimit.FxLimit.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LimitService");
    }
  }

  private static final class LimitServiceFileDescriptorSupplier
      extends LimitServiceBaseDescriptorSupplier {
    LimitServiceFileDescriptorSupplier() {}
  }

  private static final class LimitServiceMethodDescriptorSupplier
      extends LimitServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LimitServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (LimitServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LimitServiceFileDescriptorSupplier())
              .addMethod(getGetLimitsByKeyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
