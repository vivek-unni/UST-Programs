package com.day4.jdbcannotconfig;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestApp {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AutoConfig.class);
		JDBCService service=(JDBCService) context.getBean("service");
		service.getData();
		

	}

}
