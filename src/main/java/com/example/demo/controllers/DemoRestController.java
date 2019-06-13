package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
	@Value("${service.greeting}")
    private String message;
	
	@GetMapping("/greet")
	public String greetHello() {
		return message;
	}

	@GetMapping("/greet/{name}")
	public String greetHello(@PathVariable String name) {
		return "Hello " + name;
	}

}
