package com.atguigu.springcloud.cfgbean;


import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {//applicationcontext.xml
    @Bean
    @LoadBalanced //springCloud Ribbon 是基于Netflix Ribbon 实现的一套客户端，负载均衡的工具
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    public IRule myRule(){
//        return new RandomRule();//用我们重新选择的随机算法替代默认的轮循算法
        return new RetryRule();
    }

}
