package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ProjectFeignSkillTracker200919Application {

	public static void main(String[] args) {
		SpringApplication.run(ProjectFeignSkillTracker200919Application.class, args);
	}

}
