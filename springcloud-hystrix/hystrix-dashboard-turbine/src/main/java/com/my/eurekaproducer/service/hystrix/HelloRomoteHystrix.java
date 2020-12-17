package com.my.eurekaproducer.service.hystrix;

import com.my.eurekaproducer.service.HelloRomote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloRomoteHystrix implements HelloRomote {

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello " + name + ", this message send failed";
    }
}
