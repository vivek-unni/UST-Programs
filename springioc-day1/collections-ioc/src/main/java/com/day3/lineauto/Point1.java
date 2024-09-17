package com.day3.lineauto;

import java.util.logging.Logger;

import org.springframework.stereotype.Component;

@Component
public class Point1 {
	
	Logger logger=Logger.getLogger("Point1");
	
	private int x;
	private int y;
	
	public Point1(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point1() {
		
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

	@Override
	public String toString() {
		return "Point1 [x=" + x + ", y=" + y + "]";
	}
	
}
