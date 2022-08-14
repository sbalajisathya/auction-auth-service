package com.iiht.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AuctionAuthServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuctionAuthServiceApplication.class, args);
	}

}
