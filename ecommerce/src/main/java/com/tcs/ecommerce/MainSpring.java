package com.tcs.ecommerce;

//import javax.sql.DataSource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tcs.ecommerce.config.DBConfig;
import com.tcs.ecommerce.model.Product;
import com.tcs.ecommerce.service.ProductService;

public class MainSpring {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
		ProductService productService = context.getBean(ProductService.class);
		Product product = new Product(5, "mobile", "I Phone 10", "mobile", 123.0f);
		String result = productService.createProduct(product);
		
		System.out.println(result);
		context.close();
	}

}
