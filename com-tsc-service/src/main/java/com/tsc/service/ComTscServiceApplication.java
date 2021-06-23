package com.tsc.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ComTscServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComTscServiceApplication.class, args);
	}

}
