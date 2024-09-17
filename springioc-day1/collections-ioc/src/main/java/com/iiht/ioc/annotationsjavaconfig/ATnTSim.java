package com.iiht.ioc.annotationsjavaconfig;

import java.util.logging.Logger;

import org.springframework.stereotype.Component;

@Component("atntsim")
public class ATnTSim implements Sim {
	
	Logger logger=Logger.getLogger("ATnTSim");
	
	@Override
	public boolean connect() {
		// TODO Auto-generated method stub
		logger.info("ATNT IS RUNNING.............");
		return true;
	}

}
