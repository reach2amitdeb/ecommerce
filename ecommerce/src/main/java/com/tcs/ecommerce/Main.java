//package com.tcs.ecommerce;
//
//import java.util.Optional;
//
//import com.tcs.ecommerce.dao.ProductDAO;
//import com.tcs.ecommerce.dao.ProductDAOImpl;
//import com.tcs.ecommerce.model.Product;
//import com.tcs.ecommerce.service.ProductService;
//import com.tcs.ecommerce.service.ProductServiceImpl;
//
//public class Main {
//
//	public static void main(String[] args) {
//		
//		Product product = new Product(1, "laptop", "i5 10th Gen", "laptop", 123.0f);
//		
//		ProductService productService = ProductServiceImpl.getInstance();
//		
//		String result = productService.createProduct(product);
//		
//		if("success".equals(result)) {
//			System.out.println("record added successfully");
//		}else {
//			System.out.println("problem");
//		}
//		
//		Optional<Product> optional = productService.getProductById(1);
//		
//		if(optional.isPresent()) {
//			Product product2 = optional.get();
//			System.out.println(product2);
//		}else {
//			System.out.println("product is not available");
//		}
//	}
//
//}
