package com.ust.resttest;

import java.util.Calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api.1.0")
public class Greet {
	
	@GetMapping
	@RequestMapping("/welcome")
	public String message() {
		return "OLA! Commo Sava";
	}
	
	@GetMapping
	@RequestMapping("/time")
	public String getTime() {
		return Calendar.getInstance().getTime()+"";
	}
	
	@GetMapping
	@RequestMapping("/{gender}")
	public String genderMessage(@PathVariable String gender) {
		if(gender.equals("Female"))
			return "Welcome Miss";
		else if(gender.equals("Male"))
			return "Welcome Mister";
		else
			return "Hey there!!"; 
	}
	
	@GetMapping
	@RequestMapping("/namegender/{name}/{gender}")
	public String genderMessage2(@PathVariable String name,@PathVariable String gender) {
		if(gender.equals("Female"))
			return "Welcome Miss. "+ name;
		else if(gender.equals("Male"))
			return "Welcome Mister. "+name;
		else
			return "Hey there "+name+"!!"; 
	}
}
