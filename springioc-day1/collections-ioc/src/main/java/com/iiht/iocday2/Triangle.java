package com.iiht.iocday2;

public class Triangle implements Shape {
	
	private double height;
	private double base;
	
	
	
	public Triangle(double height, double base) {
		super();
		this.height = height;
		this.base = base;
	}

	@Override
	public String toString() {
		return "Triangle [height=" + height + ", base=" + base + "]";
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public Triangle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (0.5*this.base*this.height);
	}

	@Override
	public String getShape() {
		// TODO Auto-generated method stub
		return getClass().getName();
	}

}
