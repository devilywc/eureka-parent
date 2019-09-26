package com.ye.service.api;

import com.ye.service.impl.EurekaServiceFallBack;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "EUREKA-PROVIDER",fallback = EurekaServiceFallBack.class)
//@RequestMapping(value = "/eurekaProvider")
public interface IEurekaService {

    @RequestMapping(value = "/eurekaProvider/test/{id}")
    public String test(@PathVariable("id") Integer id);


}
