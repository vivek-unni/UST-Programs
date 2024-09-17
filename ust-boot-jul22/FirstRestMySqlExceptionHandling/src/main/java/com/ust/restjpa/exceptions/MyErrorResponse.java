package com.ust.restjpa.exceptions;

import java.util.Date;

import lombok.Data;

@Data
public class MyErrorResponse {

	private String message;
	private String errorCode;
	private Date time;
	
	
}
