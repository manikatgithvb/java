package com.example.spark12_batch_process;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spark12BatchProcessApplication {

	public static void main(String[] args) {
		System.exit(
				SpringApplication.exit(
				SpringApplication.run(Spark12BatchProcessApplication.class, args)
		));
	}

}
