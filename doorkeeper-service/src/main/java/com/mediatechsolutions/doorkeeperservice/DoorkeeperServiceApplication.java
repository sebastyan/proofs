package com.mediatechsolutions.doorkeeperservice;

import com.mediatechsolutions.doorkeeperservice.Filters.LogFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class DoorkeeperServiceApplication {
	public static void main(String[] args) {

		SpringApplication.run(DoorkeeperServiceApplication.class, args);
	}

	@Bean
	public LogFilter preFilter() {
		return new LogFilter();
	}
}
