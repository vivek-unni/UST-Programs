package com.ust.security.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeResource {
	
	@GetMapping("/")
	public String greet() {
		return "Working.................";
	}
	
	@GetMapping("/admin")
	public String greetAdmin() {
		return "Admin @ Working.................";
	}
	
	@GetMapping("/user")
	public String greetUser() {
		return "User @ Working.................";
	}
		
}
