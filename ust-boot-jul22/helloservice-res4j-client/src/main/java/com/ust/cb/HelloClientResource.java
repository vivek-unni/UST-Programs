package com.ust.cb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/client")
public class HelloClientResource {
	
	@Autowired
	RestTemplate template;
	public final static String CLIENT_SERVICE="clientService";
	
	@GetMapping("/c1")
	@CircuitBreaker(name=CLIENT_SERVICE, fallbackMethod = "callOnFail")
	public ResponseEntity<String> connect() {
		String url="http://localhost:8071/rest/service/msg";
		//url="https://bored-api.appbrewery.com/random";
		ResponseEntity<String> response =template.getForEntity(url, String.class);
		return response;
	}
	
	
	public ResponseEntity<String> callOnFail(Exception e) {
		return ResponseEntity.ok("message from callOnFail()...................");
	}
	
}
