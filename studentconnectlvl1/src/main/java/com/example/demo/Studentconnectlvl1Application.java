package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Studentconnectlvl1Application {

	public static void main(String[] args) {
		SpringApplication.run(Studentconnectlvl1Application.class, args);
		
		System.out.println("Hibernate Connected Successfully");
	}

}
