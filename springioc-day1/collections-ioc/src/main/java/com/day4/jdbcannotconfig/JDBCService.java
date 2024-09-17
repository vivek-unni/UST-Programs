package com.day4.jdbcannotconfig;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("service")
public class JDBCService {
	
	@Autowired
	private DAO dao;
	
	public void getData() throws SQLException {
		dao.select();
		
	}
	
}
