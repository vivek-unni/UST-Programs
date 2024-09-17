package com.iiht.ioc.annotationsjavaconfig;

import java.util.logging.Logger;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("tmobile")
@Primary
public class TMobile implements Sim {

	Logger logger=Logger.getLogger("ATnTSim");
	
	@Override
	public boolean connect() {
		// TODO Auto-generated method stub
		logger.info("TMOBILE IS RUNNING.............");
		return true;
	}

}
