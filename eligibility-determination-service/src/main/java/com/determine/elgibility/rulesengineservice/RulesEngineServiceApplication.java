package com.determine.elgibility.rulesengineservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RulesEngineServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RulesEngineServiceApplication.class, args);
    }

}

