package com.baron.rpc.service.registry;

import java.net.InetSocketAddress;


public interface ServiceRegistry {

    
    void register(String serviceName, InetSocketAddress inetSocketAddress);


}
