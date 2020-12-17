package com.my.eurekaproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableDiscoveryClient  // 启用服务注册与发现
@EnableFeignClients     // 启动Feign进行远程调用
@EnableHystrixDashboard
@EnableCircuitBreaker
public class EurekaHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaHystrixDashboardApplication.class, args);
    }

}
