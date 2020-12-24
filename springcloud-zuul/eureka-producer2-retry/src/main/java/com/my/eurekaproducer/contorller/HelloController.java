package com.my.eurekaproducer.contorller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/hello")
    public String hello(@RequestParam String name) {
        logger.info("request two name is {}", name);
        try {
            Thread.sleep(100000);
        } catch (Exception e) {
            logger.error("hello two error", e);
        }
        String str = "hello " + name + ", this is producer2 message";
        return str;
    }
}
