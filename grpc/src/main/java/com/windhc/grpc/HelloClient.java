package com.windhc.grpc;

import com.windhc.grpc.gen.HelloRequest;
import com.windhc.grpc.gen.HelloResponse;
import com.windhc.grpc.gen.HelloServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * @author HC
 */
public class HelloClient {

    public static void main(String[] args) throws InterruptedException {
        int port = 5000;

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", port)
                .usePlaintext()
                .build();

        HelloServiceGrpc.HelloServiceBlockingStub stub = HelloServiceGrpc.newBlockingStub(channel);

        HelloRequest request = HelloRequest.newBuilder()
                .setFirstName("windhc")
                .setLastName("")
                .build();

        HelloResponse helloResponse = stub.hello(request);
        System.out.println("response: " + helloResponse.getGreeting());

        channel.shutdown().awaitTermination(5, SECONDS);
    }
}
