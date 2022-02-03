package com.windhc.thrift;

import com.windhc.thrift.gen.AnimalService;
import com.windhc.thrift.gen.Message;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

/**
 * @author HC
 */
public class Client {

    public static void main(String[] args) throws TException {
        TTransport transport = new TSocket("localhost", 9527);
        transport.open();

        TProtocol protocol = new TBinaryProtocol(transport);
        AnimalService.Client cli = new AnimalService.Client(protocol);
        System.out.println("do rpc...");
        Message result = cli.jump(new Message("test msg"));
        transport.close();
        System.out.println("rpc done, result:" + result);
    }
}
