package com.javatechie.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestController {
	
	@GetMapping("/welcome")
	public String hello(){
		return "Welcome to the Docker Hub...!!!";
	}
}
