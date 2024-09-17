package com.ust.netflix.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/service2")
public class NetflixController {
	
	@GetMapping("/msg2")
	public String message() {
		return "Hello Watchers from PRIME...................!!";
	}

}
