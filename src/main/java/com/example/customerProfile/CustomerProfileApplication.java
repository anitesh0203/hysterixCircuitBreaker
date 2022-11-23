package com.example.customerProfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableHystrix
@ComponentScan(basePackages = "com.example")
public class CustomerProfileApplication {

	public static void main(String[] args) {
		try{
			SpringApplication.run(CustomerProfileApplication.class, args);

		} catch(Exception exception) {
			System.out.println(exception.getMessage());
		}
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
