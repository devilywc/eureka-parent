package com.ye.springcloud.eurekaserverprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication(scanBasePackages = "com.ye")
public class EurekaServerProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerProviderApplication.class, args);
    }

}
