package com.iiht.line;

import java.util.logging.Logger;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.iiht.ioc.A;

public class DrawTest {

	public static void main(String[] args) {
		Logger logger=Logger.getLogger("DrawTest");
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("beans-cp.xml");
		Object obj=context.getBean("javaLine");
		Line line=(Line) obj;
		logger.info(line+"");
		
		Points a1=(Points) context.getBean("p1");
		logger.info(a1+"");
		
		Points a2=(Points) context.getBean("p2");
		logger.info(a2+"");

		line.draw();
	}

}
