package com.cts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
@EnableWebSecurity
public class RestaurantZullApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(RestaurantZullApplication.class, args);
	}

}
