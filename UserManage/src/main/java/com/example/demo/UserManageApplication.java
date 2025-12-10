package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class UserManageApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserManageApplication.class, args);
	}

	@Bean
	RestTemplate getresttemplate() {
		
		return new RestTemplate();
	}
}
