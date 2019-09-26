package com.ye.service.impl;

import com.ye.service.api.IEurekaService;
import org.springframework.stereotype.Component;

@Component
public class EurekaServiceFallBack implements IEurekaService {

    @Override
    public String test(Integer id) {
        return id+":服务调用失败";
    }
}
