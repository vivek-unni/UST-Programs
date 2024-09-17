package com.day3.lineauto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages ="com.day3.lineauto")
public class AppConfig {

	@Bean
	public Point1 p1() {
		return new Point1(12,14);
	}
	
	@Bean
	public Point1 p2() {
		return new Point1(10,11);
	}
	
	@Bean(name="line")
	public Line line() {
		return new Line();
	}
}