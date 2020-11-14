package com.flowersareforever;

import java.util.*;

// markup only Toys by 25% for Valentine’s Day
public class ValentinesDayStrategy implements PricingStrategy {
	public float calculateTotal(Collection<Product> items) {
		float total = 0.0f;

		Iterator<Product> iter = items.iterator();
		
		while (iter.hasNext()) {
			Product item = iter.next();
			float price = item.getPrice();
			System.out.println("RegularDayStrategy.calculateTotal: price for " + item.getType() + " = " + price);
			
			// If the item is a Toy, it marks up the price by 25%.
			// use runtime checking "InstanceOf"
			
			// If you finish early FactoryMethod Pricing Strategy. Submit Factory Class & modified shopping cart class.
			
			total += price;
		}		
		
		return total;
	}
}
