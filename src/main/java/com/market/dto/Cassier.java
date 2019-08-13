package com.market.dto;

import java.util.ArrayList;
import java.util.List;

public class Cassier {

	private List<Discount> discounts = new ArrayList<Discount>();

	public double total(Cart cart) {
		double total = cart.total();
		for (Discount discount : discounts) {
			total -= discount.discount(cart);
		}
		return total;
	}

	/**
	 * add discount
	 * @param discount
	 */
	public void addDiscount(Discount discount) {
		discounts.add(discount);
	}

}
