package com.qf.j1902;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class J1902SpringcloudProduceZuul10000Application {

	public static void main(String[] args) {
		SpringApplication.run(J1902SpringcloudProduceZuul10000Application.class, args);
	}

}
