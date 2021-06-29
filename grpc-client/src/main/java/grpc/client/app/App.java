package grpc.client.app;

import grpc.client.app.fxLimit.GetLimitsByKeyRequest;
import grpc.client.app.fxLimit.GetLimitsByKeyResponse;
import grpc.client.app.fxLimit.LimitServiceGrpc;
import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger loggerMain = Logger.getLogger(App.class.getName());

    public static void main( String[] args )
    {
        String target = "localhost:8080";
       
        ManagedChannel channel = ManagedChannelBuilder.forTarget(target)
            .usePlaintext()
            .build();
        
        GrpcClient limitClient = new GrpcClient(channel);
  
        GetLimitsByKeyRequest request = GetLimitsByKeyRequest.newBuilder().build();
        GetLimitsByKeyResponse response = limitClient.getLimitsByKey(request);
  
        loggerMain.info("Received response with limit 0 id: " + response.getLimits(0).getId());
  
  
        channel.shutdown();
    }
}


class GrpcClient {
    private static final Logger logger = Logger.getLogger(GrpcClient.class.getName());

    private static LimitServiceGrpc.LimitServiceBlockingStub blockingStub;

    public GrpcClient(Channel channel){
      blockingStub = LimitServiceGrpc.newBlockingStub(channel);
    }

    public GetLimitsByKeyResponse getLimitsByKey(GetLimitsByKeyRequest request){

      GetLimitsByKeyResponse response = null;

      try {
        response = blockingStub.getLimitsByKey(request);
      } catch (StatusRuntimeException e) {
        logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
      }

      return response;

    }
}