package com.flowersareforever;

import java.util.*;

public class ValentinesDayStrategy implements PricingStrategy {

	public float calculateTotal(Collection<Product> items) {
		float total = 0.0f;
		Iterator<Product> iter = items.iterator();
		
		while (iter.hasNext()) {
			Product item = iter.next();
			float price = item.getPrice();

			// If the item is a Toy, it marks up the price by 25%.
			if (item instanceof Toy) {
				price *= 1.25f;
			}
			System.out.println("ValentinesDayStrategy.calculateTotal: price for " + item.getType() + " = " + price);
			total += price;
		}		
		
		return total;
	}
}
