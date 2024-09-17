package com.ust.resttest;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Locale.LanguageRange;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/langlocale")
public class LangLocale {
	
	@PostMapping
	@RequestMapping("/{locale}")
	public String LangLocale(@RequestHeader HttpHeaders header1){
		
//		Charset charset=Charset.defaultCharset();
//		List<Charset> list=new ArrayList<>();
//		list.add(charset);
		
		List<Locale> list1=header1.getAcceptLanguageAsLocales();
		if(list1.equals("[en]"))
			return "Hi";
		else if(list1.equals("in"))
			return "Namaste";
		else if(list1.equals("uk"))
			return "Hello";
		else
			return "Error";
		
	}
}
