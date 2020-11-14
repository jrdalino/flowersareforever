package com.flowersareforever;

import java.util.Vector;

public class ShoppingCart {
	Vector<Product> listOfItems = new Vector<Product>();
	private PricingStrategy strategy = null; // polymorphic strategies

	public ShoppingCart() {
		strategy = new RegularDayStrategy();
	}

	public void setStrategy(int occasion) {
		switch(occasion) {
			case PricingStrategy.VALENTINE: strategy = new ValentinesDayStrategy();
				break;
			case PricingStrategy.MOTHER: strategy = new MothersDayStrategy();
				break;
			default: strategy = new RegularDayStrategy();
		}
	}

	public float checkout() {
		return strategy.calculateTotal(listOfItems);
	}
	
	public void add (Product item) {
		if (item != null)
		listOfItems.add(item);
	}
}
