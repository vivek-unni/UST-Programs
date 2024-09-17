package com.iiht.iocday2;

import java.util.logging.Logger;

public class Rectangle implements Shape {
	
	private double length;
	private double breadth;
	
	Logger logger=Logger.getLogger("Rectangle");
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}

	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.length*this.breadth;
	}

	@Override
	public String getShape() {
		// TODO Auto-generated method stub
		return getClass().getName();
	}
	
	public void init(){
		logger.info("init has been called..........!!!");
	}
	
	public void destroy() {
		logger.info("destroy method is called.........!!!!!!!!");
	}

}
