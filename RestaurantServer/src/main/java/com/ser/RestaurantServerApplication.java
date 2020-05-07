package com.ser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class RestaurantServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantServerApplication.class, args);
	}

}
