package com.iiht.ioc.annotationsjavaconfig;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestComponents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger=Logger.getLogger("TestComponents");
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		
		logger.info(context.toString());
		logger.info(context.getBean(ATnTSim.class)+"");
		logger.info(context.getBean("atntsim")+"");
		
		Mobile nothing=(Mobile) context.getBean("nothing");
		nothing.turnOn();
		
	}

}
