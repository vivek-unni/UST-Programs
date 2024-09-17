package com.iiht.iocday2;

public class Rhombus implements Shape {
	
	private double base;
	private double height;
	
	
	public Rhombus(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rhombus [base=" + base + ", height=" + height + "]";
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Rhombus() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (this.base*this.height);
	}

	@Override
	public String getShape() {
		// TODO Auto-generated method stub
		return getClass().getName();
	}

}
