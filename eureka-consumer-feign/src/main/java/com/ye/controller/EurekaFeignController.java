package com.ye.controller;

import com.ye.service.api.IEurekaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/feign")
public class EurekaFeignController {

    @Autowired
    private IEurekaService eurekaService;

    @RequestMapping(value = "/test/{id}")
    @ResponseBody
    public String test(@PathVariable Integer id){
        return eurekaService.test(id);
    }
}
