package com.training.oracle.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class ProducerController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello from microservice producer...!!!!";
	}

}
