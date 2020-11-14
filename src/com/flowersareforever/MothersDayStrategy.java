package com.flowersareforever;

import java.util.*;

public class MothersDayStrategy implements PricingStrategy {

	public float calculateTotal(Collection<Product> items) {
		float total = 0.0f;
		Iterator<Product> iter = items.iterator();

		while (iter.hasNext()) {
			Product item = iter.next();
			float price = item.getPrice();

			// If the item is a Flower, mark up the price by 15%.
			if (item instanceof Flower) {
				price *= 1.15f;
			}
			System.out.println("MothersDayStrategy.calculateTotal: price for " + item.getType() + " = " + price);
			total += price;
		}
		
		return total;
	}
}
