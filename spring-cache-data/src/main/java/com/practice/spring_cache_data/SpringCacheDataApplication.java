package com.practice.spring_cache_data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringCacheDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCacheDataApplication.class, args);
	}

}
