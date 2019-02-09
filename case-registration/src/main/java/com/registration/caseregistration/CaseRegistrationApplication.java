package com.registration.caseregistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CaseRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CaseRegistrationApplication.class, args);
	}

}

