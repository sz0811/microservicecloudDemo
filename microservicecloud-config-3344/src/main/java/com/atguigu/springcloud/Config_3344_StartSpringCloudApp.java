package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class Config_3344_StartSpringCloudApp {
    public static void main(String[] args) {
        //http://config-3344.com:3344/application-test.yml
        //http://config-3344.com:3344/application/dev/master 访问带分支的
        //http://config-3344.com:3344/application-dev.yml
        //可以访问到
        SpringApplication.run(Config_3344_StartSpringCloudApp.class,args);
    }
}
