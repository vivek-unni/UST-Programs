package com.test1.testing;

public class Milk {
	
	String type;
    int priceperUnit;
    String farmId;
    int totalQuantity;
	
	public Milk(String type, int priceperUnit, String farmId, int totalQuantity) {
		super();
		this.type = type;
		this.priceperUnit = priceperUnit;
		this.farmId = farmId;
		this.totalQuantity = totalQuantity;
	}

	@Override
	public String toString() {
		return "Milk [type=" + type + ", priceperUnit=" + priceperUnit + ", farmId=" + farmId + ", totalQuantity="
				+ totalQuantity + "]";
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

	public String getFarmId() {
		return farmId;
	}

	public void setFarmId(String farmId) {
		this.farmId = farmId;
	}

	public int getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(int totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	public Milk() {
		// TODO Auto-generated constructor stub
	}

}
