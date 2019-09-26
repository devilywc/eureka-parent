package com.ye.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/eurekaProvider")
public class EurekaProviderController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/test/{id}")
    public String test(@PathVariable Integer id){
        System.out.println("id = [" + id + "]");
        return "provider["+port+"]:"+id;
    }
}
