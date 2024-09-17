package com.iiht.line;

public class Points {
	
	public int x;
	public int y;

	
	
	public Points(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}



	@Override
	public String toString() {
		return "Points [x=" + x + ", y=" + y + "]";
	}



	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public int getY() {
		return y;
	}



	public void setY(int y) {
		this.y = y;
	}



	public Points() {
		// TODO Auto-generated constructor stub
	}

}
