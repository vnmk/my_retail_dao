package com.myretail.domain.product_price;

import com.myretail.domain.product_price.ProductPrice;
import com.myretail.domain.product_price.ProductPriceDA;

import junit.framework.TestCase;

public class ProductPriceDA_Test extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	public final void testCreateProductPrice() {

		ProductPrice price = new ProductPrice(13860428,1450,"USD");
		ProductPriceDA.getInstance().createProductPrice(price);
		
		assertEquals(150.0,ProductPriceDA.getInstance().getProductPrice(2).getCurrentValue());
	}

	

}
