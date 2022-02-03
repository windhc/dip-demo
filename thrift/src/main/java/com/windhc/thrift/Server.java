package com.windhc.thrift;

import com.windhc.thrift.gen.AnimalService;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TTransportException;

/**
 * @author HC
 */
public class Server {

    public static void main(String[] args) {
        try {
            start();
        } catch (TTransportException e) {
            e.printStackTrace();
        }
    }

    public static void start() throws TTransportException {
        TServerTransport serverTransport = new TServerSocket(9527);
        TSimpleServer ser = new TSimpleServer(new TServer.Args(serverTransport)
                .processor(new AnimalService.Processor<>(new CatServiceImpl())));
        System.out.println("Starting the server...");
        ser.serve();
        System.out.println("done.");
    }
}
