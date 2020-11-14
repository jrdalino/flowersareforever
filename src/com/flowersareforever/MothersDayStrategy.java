package com.flowersareforever;

import java.util.*;

// markup only Flowers by 15% for Mother’s Day
public class MothersDayStrategy implements PricingStrategy {
	public float calculateTotal(Collection<Product> items) {
		float total = 0.0f;
		
		Iterator<Product> iter = items.iterator();

		while (iter.hasNext()) {
			Product item = iter.next();
			float price = item.getPrice();
			System.out.println("RegularDayStrategy.calculateTotal: price for " + item.getType() + " = " + price);
			
			// If the item is a Flower, it marks up the price by 15%.
			// use runtime checking "InstanceOf"
			
			total += price;
		}
		
		return total;
	}
}
