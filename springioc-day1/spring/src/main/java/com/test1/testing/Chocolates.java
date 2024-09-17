package com.test1.testing;

public class Chocolates {
	
	String type;
    int priceperUnit;
    String manufacturerId;
    int totalQuantity;
	
	public Chocolates(String type, int priceperUnit, String manufacturerId, int totalQuantity) {
		super();
		this.type = type;
		this.priceperUnit = priceperUnit;
		this.manufacturerId = manufacturerId;
		this.totalQuantity = totalQuantity;
	}

	@Override
	public String toString() {
		return "Chocolates [type=" + type + ", priceperUnit=" + priceperUnit + ", manufacturerId=" + manufacturerId
				+ ", totalQuantity=" + totalQuantity + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPriceperUnit() {
		return priceperUnit;
	}

	public void setPriceperUnit(int priceperUnit) {
		this.priceperUnit = priceperUnit;
	}

	public String getManufacturerId() {
		return manufacturerId;
	}

	public void setManufacturerId(String manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	public int getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	public Chocolates() {
		// TODO Auto-generated constructor stub
	}

}
