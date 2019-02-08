package com.data.collection.income;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class IncomeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(IncomeServiceApplication.class, args);
    }

}

