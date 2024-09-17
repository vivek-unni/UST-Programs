package com.ust.resttest;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api.2.0")
public class Greet2 {
	
	@GetMapping
	@RequestMapping("/welcome")
	public ResponseEntity<String> message() {
		ResponseEntity<String> response=new ResponseEntity<>("OLA! Commo Sava", HttpStatus.OK);
		return response;
	}
	
	@GetMapping
	@RequestMapping("/time")
	public ResponseEntity<String> getTime() {
		//ResponseEntity<String> response=new ResponseEntity<>(Calendar.getInstance().getTime()+"", HttpStatus.OK);
		return ResponseEntity.status(HttpStatus.OK).body(Calendar.getInstance().getTime()+"");
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
	public ResponseEntity<String> genderMessage2(@RequestHeader HttpHeaders headers,@PathVariable String name,@PathVariable String gender) {
		
		Set <String> set =headers.keySet();
		Iterator<String> keys=set.iterator();
		String keyStr=null;
		while(keys.hasNext()) {
			keyStr+=keys.next()+"\n";
		}
		String keyValueStr=null;
		Set<Entry<String,List<String>>> entries=headers.entrySet();
		Iterator iter2=entries.iterator();
		while(iter2.hasNext()) {
			keyValueStr+=iter2.next()+"<br/>";
		}
		
		HttpHeaders header2=new HttpHeaders();
		//header2.setAcceptLanguageAsLocales(null);
		//header2.setAcceptCharset((List<Charset>)Charset.defaultCharset());
		header2.setAcceptCharset(Arrays.asList(Charset.defaultCharset()));

		header2.setContentType(MediaType.TEXT_HTML);
		header2.setContentLength(keyValueStr.length());
		header2.set("ust", "GammaTraining#6");
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).headers(header2).body(keyValueStr);
		
		
		/*
		 * if(gender.equals("Female")) return "Welcome Miss. "+ name; else
		 * if(gender.equals("Male")) return "Welcome Mister. "+name; else return
		 * "Hey there "+name+"!!";
		 */
	}
	
	@PostMapping
	@RequestMapping("/namegender")
	public ResponseEntity<String> genderMessage3(@RequestBody Member member) {
		if(member.getGender().equals("Female"))
			return ResponseEntity.ok("Welcome Miss. "+member.getName());
		else if(member.getGender().equals("Male"))
			return ResponseEntity.ok("Welcome Mister. "+member.getName());
		else
			return ResponseEntity.ok("Welcome  "+member.getName());
	}
}
