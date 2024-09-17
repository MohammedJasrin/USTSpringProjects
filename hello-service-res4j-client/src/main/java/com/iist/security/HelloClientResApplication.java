package com.iist.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class HelloClientResApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloClientResApplication.class, args);
	}
	@Bean
	public RestTemplate newTemplate() {
		return new RestTemplate();
	}
}
