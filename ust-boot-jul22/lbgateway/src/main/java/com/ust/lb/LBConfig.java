package com.ust.lb;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LBConfig {

	@Bean 
	public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) { 
		return  builder.routes().
				route(  "lbservice-route", 
						r->r.path("/test/**").  
						//filters(f->f.addRequestHeader("Hello","World")).  
						uri("lb://LBSERVICE")).
				build(); 
		  
	}
	
}


 
