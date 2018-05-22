package com.liao.ms.bbs;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
//@EnableScheduling
public class MainApplication {
    public static void main(String[] args) {
    	new SpringApplicationBuilder(MainApplication.class).web(true).run(args);
    }
}
