package com.day3.annotations;

import java.util.logging.Logger;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotationConfig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger=Logger.getLogger("TestAnnotationConfig");
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans-cp.xml");
		
		Object obj=context.getBean(LifeCycleAnnotations.class);
		
		logger.info(obj.toString());
		
		context.close();

	}

}
