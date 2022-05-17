package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroServiceApp1Application {

	public static void main(String[] args) {
		System.out.println("application 1 client");
		SpringApplication.run(MicroServiceApp1Application.class, args);
	}

}
