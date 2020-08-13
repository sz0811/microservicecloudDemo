package com.atguigu.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientRest {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${server.port}")
    private String port;

    @Value("${eureka.client.server-url.defualtZone}")
    private String eurekaServers;
//http://client-config.com:8201/config
    @RequestMapping("/config")
    public String getConfig(){
        String str = "applicationName:"+applicationName+"\t eurekaServers:"+eurekaServers+"\t port:"+port;
        System.out.println("*****str"+str);
        return str;
    }

}
