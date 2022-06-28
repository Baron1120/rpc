package com.baron.rpc.transport;

import com.baron.rpc.serializer.CommonSerializer;


public interface RpcServer {

    int DEFAULT_SERIALIZER = CommonSerializer.KRYO_SERIALIZER;

    void start();

    <T> void publishService(T service, String serviceName);

}
