package com.training.oracle.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {
	
	@Autowired
	RestTemplate resttemplate;

	
	@GetMapping("/show")
	public String show() {
		ResponseEntity<String> response =  resttemplate.getForEntity("Http://localhost:3001/producer/hello", String.class);
		
		return "Hello from consumer...getting data from producer..." +response.getBody();
	}
}
