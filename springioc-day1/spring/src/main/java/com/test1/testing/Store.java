package com.test1.testing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Store {	

	List<Egg> eggsList = new ArrayList<>();	
	
	public Store(List<Egg> eggsList) {
		super();
		this.eggsList = eggsList;
	}

	@Override
	public String toString() {
		return "Store [eggsList=" + eggsList + ", milkSet=" + milkSet + "]";
	}

	public List<Egg> getEggsList() {
		return eggsList;
	}

	public void setEggsList(List<Egg> eggsList) {
		this.eggsList = eggsList;
	}
        
	HashSet<Milk> milkSet = new HashSet<>();
	
	public HashSet<Milk> getMilkSet() {
		return milkSet;
	}

	public void setMilkSet(HashSet<Milk> milkSet) {
		this.milkSet = milkSet;
	}
	

	//	System.out.println(milkSet);
//	
//	        
//	LinkedList<Chocolates> chocoList = new LinkedList<>();  
//	System.out.println(chocoList);
//	
//	        
//	//        TreeSet<Apples> appleSet = new TreeSet<>();
//	//        appleSet.add(apple1);
//	//        appleSet.add(apple2);
//	
//	Queue<Bread> breadQueue = new LinkedList<>();       
//	System.out.println(breadQueue);
//	
//	        
//	HashMap<String, Collection> items = new HashMap<>();
//	items.put("eggs", eggsList);
//	items.put("milk", milkSet);
//	items.put("chocolates", chocoList);
//	//   items.put("apples", appleSet);
//	items.put("bread", breadQueue);
//	
//	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//
//	
	public Store() {
		// TODO Auto-generated constructor stub
	}

	public Store(HashSet<Milk> milkSet) {
		super();
		this.milkSet = milkSet;
	}
}
