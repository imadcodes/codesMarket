package com.market.dto;

public class ArticleFactory {

	private int nextId = 0;

	/**
	 * Method to create articles
	 * @param price
	 * @return
	 */
	public Article article(double price) {
		nextId += 1;
		return new Article(nextId, new Price(price));
	}
	
}
