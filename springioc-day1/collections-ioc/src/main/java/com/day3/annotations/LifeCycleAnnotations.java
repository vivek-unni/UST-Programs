package com.day3.annotations;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifeCycleAnnotations {
	
	Logger logger=Logger.getLogger("LifeCycleAnnotations");
	
	public LifeCycleAnnotations() {
		// TODO Auto-generated constructor stub
		logger.info("from default constructor............");
	}
	
	@PostConstruct
	public void myInit() {
		logger.info("init called...................");
	}
	
	@PreDestroy
	public void myDestroy() {
		logger.info("destroy called...................");
	}

}
