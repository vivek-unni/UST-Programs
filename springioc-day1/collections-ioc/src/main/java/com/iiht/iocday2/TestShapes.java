package com.iiht.iocday2;

import java.util.logging.Logger;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestShapes {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		
		Logger logger=Logger.getLogger("TestShapes");
		
		//BeanFactory factory=new FileSystemXmlApplicationContext("beans.xml");
		ClassPathXmlApplicationContext factory =new ClassPathXmlApplicationContext("beans.xml");
		factory.registerShutdownHook();
		logger.info(factory+"");
		
		Shape s=(Rectangle) factory.getBean("rect");
		logger.info(s.toString());
		double result=s.area();
		logger.info(result+"");
		logger.info(s.getShape());
		
		Shape t=(Triangle) factory.getBean("tri");
		logger.info(t.toString());
		double result1=t.area();
		logger.info(result1+"");
		logger.info(t.getShape());
		
		Shape r=(Rhombus) factory.getBean("rho");
		logger.info(r.toString());
		double result2=r.area();
		logger.info(result2+"");
		logger.info(r.getShape());
	
	}

}