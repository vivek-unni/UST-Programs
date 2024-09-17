package com.ust.netflix.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/service")
public class NetflixController {
	
	@GetMapping("/msg")
	public String message() {
		return "Hello Watchers...................!!";
	}

}
