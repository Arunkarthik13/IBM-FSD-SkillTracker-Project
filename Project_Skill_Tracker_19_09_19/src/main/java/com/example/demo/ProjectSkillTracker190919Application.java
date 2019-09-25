package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProjectSkillTracker190919Application {

	public static void main(String[] args) {
		SpringApplication.run(ProjectSkillTracker190919Application.class, args);
	}

}
