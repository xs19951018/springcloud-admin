package com.my.eurekaproducer.service;

import com.my.eurekaproducer.service.hystrix.HelloRomoteHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "eureka-producer2", fallback = HelloRomoteHystrix.class)
public interface HelloRomote {

    @RequestMapping(value = "/hello")
    public String hello2(@RequestParam(value = "name") String name);

}
