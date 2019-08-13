package com.market.dto;

public class Price {

	private final double price;

	public Price(double price) {
		this.price = price;
	}

	/**
	 * 
	 * @param amount
	 * @return
	 */
	public double total(double amount) {
		return price * amount;
	}

}