package com.iist.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignClientssApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignClientssApplication.class, args);
	}

}
