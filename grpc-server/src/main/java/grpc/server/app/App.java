package grpc.server.app;

import grpc.server.app.fxLimit.Limit;
import grpc.server.app.fxLimit.GetLimitsByKeyRequest;
import grpc.server.app.fxLimit.GetLimitsByKeyResponse;
import grpc.server.app.fxLimit.LimitServiceGrpc;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class App 
{
    public static void main( String[] args )
    {
        final GrpcServer server = new GrpcServer();
        try {
			server.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			server.blockUntilShutdown();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}


class GrpcServer{
    private static final Logger logger = Logger.getLogger(GrpcServer.class.getName());

    private Server server;

    public void start()throws IOException {
        int port = 8080;
        server = ServerBuilder.forPort(port)
        .addService(new LimitServiceImpl())
        .build()
        .start();

        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
          @Override
          public void run() {
            // Use stderr here since the logger may have been reset by its JVM shutdown hook.
            System.err.println("*** shutting down gRPC server since JVM is shutting down");
            try {
                GrpcServer.this.stop();
            } catch (InterruptedException e) {
              e.printStackTrace(System.err);
            }
            System.err.println("*** server shut down");
          }
        });
    }

    private void stop() throws InterruptedException {
        if (server != null) {
        server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }
    
    public void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
          server.awaitTermination();
        }
      }

  static class LimitServiceImpl extends LimitServiceGrpc.LimitServiceImplBase {
	private static final Logger loggerLimit = Logger.getLogger(LimitServiceImpl.class.getName());

    @Override
    public void getLimitsByKey(GetLimitsByKeyRequest req, StreamObserver<GetLimitsByKeyResponse> responseObserver) {
        Limit limit = Limit.newBuilder().setId("1233").build();
        loggerLimit.info("request done");
        GetLimitsByKeyResponse response = GetLimitsByKeyResponse.newBuilder().addLimits(limit).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
  }
    
}