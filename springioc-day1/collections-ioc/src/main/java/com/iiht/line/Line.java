package com.iiht.line;

import java.util.logging.Logger;

public class Line {

	Points p1=new Points();
	Points p2=new Points();
	public Line() {
		// TODO Auto-generated constructor stub
	}
	public Points getP1() {
		return p1;
	}

	public void setP1(Points p1) {
		this.p1 = p1;
	}

	public Points getP2() {
		return p2;
	}

	public void setP2(Points p2) {
		this.p2 = p2;
	}

	public Line(Points p1, Points p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
	}

	Logger logger=Logger.getLogger("Line");
	
	public void draw() {
		logger.info("A line is drawn between "+p1+" & "+p2);
	}

}
