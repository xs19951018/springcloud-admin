package com.my.eurekaproducer.contorller;

import com.my.eurekaproducer.service.HelloRomote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired(required = false)
    private HelloRomote helloRomote;

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return helloRomote.hello2(name);
    }
}
