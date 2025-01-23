package com.backend.API.E_commerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.backend.API.E_commerce")
@EntityScan(basePackages = "com.backend.API.E_commerce.model")
@EnableJpaRepositories(basePackages = "com.backend.API.E_commerce.repository")
public class ApiECommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiECommerceApplication.class, args);
	}

}
