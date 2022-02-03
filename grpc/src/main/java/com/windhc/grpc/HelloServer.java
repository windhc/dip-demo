package com.windhc.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;

/**
 * @author HC
 */
public class HelloServer {

    public static void main(String[] args) {
        try {
            int port = 5000;
            final Server server = ServerBuilder.forPort(port)
                    .addService(new HelloServiceImpl())
                    .build()
                    .start();

            System.out.println("Server started, listening on " + port);
            server.awaitTermination();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
