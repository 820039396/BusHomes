package com.qf.j1902;

import com.qf.j1902.filter.Myfilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class J1902SpringcloudProduceZuul10000Application {

	public static void main(String[] args) {
		SpringApplication.run(J1902SpringcloudProduceZuul10000Application.class, args);
	}

	@Bean
	public Myfilter myfilter(){
		return new Myfilter();
	}
}