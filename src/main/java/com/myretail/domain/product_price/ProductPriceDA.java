package com.myretail.domain.product_price;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

public class ProductPriceDA {

	private static ProductPriceDA da; 
	private ApplicationContext ctx;
	private MongoOperations mongoOperation;
	
	private ProductPriceDA(){
		ctx = new GenericXmlApplicationContext("SpringConfig.xml");
		mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");
	}
	
	public static ProductPriceDA getInstance() {
		
		if(da==null)
			da = new ProductPriceDA();
		
		return da;
	}
	
	
	public void createProductPrice(ProductPrice price) {
		
		mongoOperation.save(price);
		
	}
	
	public void updateProductPrice(ProductPrice price) {
		
		mongoOperation.save(price);
	}
	
	public ProductPrice getProductPrice(long id) {
		
		Query searchProductPriceQuery = new Query(Criteria.where("id").is(id));

		ProductPrice price = mongoOperation.findOne(searchProductPriceQuery, ProductPrice.class);
		System.out.println("Product : " + price.getCurrentValue());
		
		return price;
	}
}
