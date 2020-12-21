package com.my.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConfigClientRabbitmqApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientRabbitmqApplication.class, args);
    }

}
