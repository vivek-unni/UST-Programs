package com.ust.lb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	Environment environment;
	
	//private int port;
	
	@GetMapping
	public String message() {
		String port=environment.getProperty("local.server.port");
		return "Port used is "+port;
	}

}
