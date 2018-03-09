package com.liao;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BServiceApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(BServiceApplication.class).web(true).run(args);
	}

}
