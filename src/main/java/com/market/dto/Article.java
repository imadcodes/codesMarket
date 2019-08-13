package com.market.dto;

public class Article {

	private final Price price;
	private final int id;

	public Article(int id, Price price) {
		this.id = id;
		this.price = price;
	}

	public double total(double amount) {
		return price.total(amount);
	}
}