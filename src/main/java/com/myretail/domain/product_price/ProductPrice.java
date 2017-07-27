package com.myretail.domain.product_price;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Class representing the current value of the product and the currency that the price is in.
 * 
 * @author VenkataRaidu
 *
 */

@Document(collection = "products_price")
public class ProductPrice {
	
	
	@Id
	private long id;
	private double currentValue;
	private String currencyCode;
	
	
	public ProductPrice(long id, double currentValue, String currencyCode) {
		super();
		this.id = id;
		this.currentValue = currentValue;
		this.currencyCode = currencyCode;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getCurrentValue() {
		return currentValue;
	}
	public void setCurrentValue(double currentValue) {
		this.currentValue = currentValue;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

		
		
}
