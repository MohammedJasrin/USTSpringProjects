package com.iist.lb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LbeurakaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LbeurakaApplication.class, args);
	}

}
