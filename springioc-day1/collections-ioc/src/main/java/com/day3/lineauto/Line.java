package com.day3.lineauto;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.iiht.ioc.annotationsjavaconfig.Sim;


public class Line {
	
	Logger logger=Logger.getLogger("Line");
	@Autowired
	private Point1 p1;
	
	@Autowired
	private Point1 p2;
	
	public Line() {
		// TODO Auto-generated constructor stub
	}

	public Line(Point1 p1, Point1 p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
	}

	public Point1 getP1() {
		return p1;
	}

	public void setP1(Point1 p1) {
		this.p1 = p1;
	}

	public Point1 getP2() {
		return p2;
	}

	public void setP2(Point1 p2) {
		this.p2 = p2;
	}

	@Override
	public String toString() {
		return "Line [p1=" + p1 + ", p2=" + p2 + "]";
	}
	

}
