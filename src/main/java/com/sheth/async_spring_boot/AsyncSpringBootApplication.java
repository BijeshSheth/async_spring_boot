package com.sheth.async_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class AsyncSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsyncSpringBootApplication.class, args);
	}

}
