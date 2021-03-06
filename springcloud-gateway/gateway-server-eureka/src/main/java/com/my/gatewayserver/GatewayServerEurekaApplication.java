package com.my.gatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayServerEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayServerEurekaApplication.class, args);
    }

    @Bean
    public RouteLocator customRouterLocator(RouteLocatorBuilder builder) {
        return builder.routes().route("path_route", r -> r.path("/about").uri("http://ityouknow.com")).build();
    }
}
