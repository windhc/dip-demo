package com.windhc.thrift;

import com.windhc.thrift.gen.AnimalService;
import com.windhc.thrift.gen.Message;
import org.apache.thrift.TException;

/**
 * @author HC
 */
public class CatServiceImpl implements AnimalService.Iface {

    @Override
    public Message jump(Message msg) throws TException {
        System.out.println("cat jump");
        return msg;
    }
}
