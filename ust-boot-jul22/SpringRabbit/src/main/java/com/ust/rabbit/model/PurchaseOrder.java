package com.ust.rabbit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PurchaseOrder {

	private String orderId;
	private String company;
	private int qty;
	private double price;
	
}
