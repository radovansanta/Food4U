package com.example.Food4U;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Food4UApplication {

	// Not forget to set a postgres password in resources/application.properties
	// Test it by url http://localhost:8080/api/v1/users
	// Or by Postman app with url http://localhost:8080/api/v1/users and body with JSON
	public static void main(String[] args) {
		SpringApplication.run(Food4UApplication.class, args);
	}

}
