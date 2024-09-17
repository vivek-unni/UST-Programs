package com.test1.testing;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStore {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		
		List<Egg> eggsList = (List<Egg>) context.getBean("eggsList");
		System.out.println(eggsList);
		
		Egg e1=(Egg) context.getBean("countryEgg");
		System.out.println(e1);
		
		Egg e2=(Egg) context.getBean("countryEgg1");
		System.out.println(e2);
	
		Egg e3=(Egg) context.getBean("countryEgg2");
		System.out.println(e3);
		
	}
	
	public TestStore() {
		// TODO Auto-generated constructor stub
	}

}
