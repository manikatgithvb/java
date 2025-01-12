package com.example.spark5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Spark5Application {

	public static void main(String[] args) {
		SpringApplication.run(Spark5Application.class, args);
	}

}
