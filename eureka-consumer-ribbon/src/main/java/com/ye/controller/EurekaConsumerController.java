package com.ye.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
//@RequestMapping(value = "eurekaConsumer")
public class EurekaConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(defaultFallback = "def")
    @RequestMapping(value = "test")
    public String test(){
        System.out.println("EurekaConsumerController.test");
        String result = restTemplate.getForObject("http://EUREKA-PROVIDER/eurekaProvider/test/10", String.class);
        return "[ribbon]:"+result;
    }

    public String def(){
        return "暂时不可调用,请稍后再试";
    }
}
