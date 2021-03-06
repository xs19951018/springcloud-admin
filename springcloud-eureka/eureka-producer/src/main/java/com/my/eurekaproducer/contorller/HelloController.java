package com.my.eurekaproducer.contorller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(@RequestParam String name) {
        String str = "hello " + name + ", this is producer1 message";
        return str;
    }

    @RequestMapping("/foo")
    public String foo(String foo) {
        return "hello " + foo + "!";
    }
}
