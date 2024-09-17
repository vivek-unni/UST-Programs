package com.test1.testing;

public class Egg {
	
	int id;
	String description;
	int qty;

	
	
	public Egg(int id, String description, int qty) {
		super();
		this.id = id;
		this.description = description;
		this.qty = qty;
	}



	@Override
	public String toString() {
		return "Egg [id=" + id + ", description=" + description + ", qty=" + qty + "]";
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public int getQty() {
		return qty;
	}



	public void setQty(int qty) {
		this.qty = qty;
	}



	public Egg() {
		// TODO Auto-generated constructor stub
	}

}
