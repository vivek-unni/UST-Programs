package com.day3.lineauto;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger=Logger.getLogger("TestLine");
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Line straight=(Line) context.getBean("line");
		logger.info(straight.toString());
		context.close();
		
	}

}
