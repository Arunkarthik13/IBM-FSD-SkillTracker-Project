package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringEurekaServer160919Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaServer160919Application.class, args);
	}

}
