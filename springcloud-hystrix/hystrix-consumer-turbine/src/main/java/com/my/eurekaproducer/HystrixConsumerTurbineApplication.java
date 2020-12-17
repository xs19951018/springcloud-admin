package com.my.eurekaproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient  // 启用服务注册与发现
@EnableFeignClients     // 启动Feign进行远程调用
@EnableCircuitBreaker
public class HystrixConsumerTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixConsumerTurbineApplication.class, args);
    }

}
