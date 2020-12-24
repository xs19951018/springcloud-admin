package com.my.eurekaproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaProducer2RetryApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProducer2RetryApplication.class, args);
    }

}
