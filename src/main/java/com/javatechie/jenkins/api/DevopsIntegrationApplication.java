package com.javatechie.jenkins.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan(basePackages ="com.javatechie.controller")
public class DevopsIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsIntegrationApplication.class, args);
		System.out.println("STARTED!!!!!!!!!");
	}

}
