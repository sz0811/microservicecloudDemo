package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Config_Git_EurekaServerApplication {
    public static void main(String[] args) {
        //http://eureka7001.com:7001/  能正常访问
        SpringApplication.run(Config_Git_EurekaServerApplication.class,args);
    }
}
