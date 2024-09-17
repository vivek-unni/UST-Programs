package com.ust.registry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/client")
public class HelloClient {
	
	@Autowired
	RestTemplate template;
	@Autowired
	RestTemplate template2;
	
	@GetMapping("/c1")
	public ResponseEntity<String> connect() {
		String url="http://localhost:8071/rest/service/msg";
		//url="https://bored-api.appbrewery.com/random";
		ResponseEntity<String> response =template.getForEntity(url, String.class);
		return response;
	}
	
	@GetMapping("/c2")
	public ResponseEntity<String> connect2() {
		String url="http://localhost:8074/rest/service2/msg2";
		//url="https://bored-api.appbrewery.com/random";
		ResponseEntity<String> response =template.getForEntity(url, String.class);
		return response;
	}

}
