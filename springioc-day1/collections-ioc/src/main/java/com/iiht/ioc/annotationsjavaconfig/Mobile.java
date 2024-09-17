package com.iiht.ioc.annotationsjavaconfig;


import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("nothing")
public class Mobile {
	
	Logger logger=Logger.getLogger("Mobile");
	
	@Autowired
	@Qualifier("atntsim")
	private Sim simcard;
	
	public void turnOn() {
		boolean status=simcard.connect();
		
		logger.info(status?"Connected........":"Not Connected..........");
	}
}
