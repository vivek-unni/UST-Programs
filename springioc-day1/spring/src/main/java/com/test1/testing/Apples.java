package com.test1.testing;

import java.util.Objects;

public class Apples
{
	String type;
	int priceperUnit;
	String farmId;
	int totalQuantity;
	
	public Apples() {
		// TODO Auto-generated constructor stub
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

	@Override
	public int hashCode() {
		return Objects.hash(farmId, priceperUnit, totalQuantity, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Apples other = (Apples) obj;
		return Objects.equals(farmId, other.farmId) && priceperUnit == other.priceperUnit
				&& totalQuantity == other.totalQuantity && Objects.equals(type, other.type);
	}

	public Apples(String type, int priceperUnit, String farmId, int totalQuantity) {
		super();
		this.type = type;
		this.priceperUnit = priceperUnit;
		this.farmId = farmId;
		this.totalQuantity = totalQuantity;
	}
	
}
