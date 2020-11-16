package com.tcs.ecommerce.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.ecommerce.dao.ProductDAO;
import com.tcs.ecommerce.model.Product;

//@Service will take care of below commented code and for singleton implementation.

@Service
public class ProductServiceImpl implements ProductService {
	
//	private static ProductService dao;
//	
//	private ProductServiceImpl() {
//		
//	}
//	
//	public static ProductService getInstance() {
//		
//		if(dao == null) {
//			dao = new ProductServiceImpl();
//			System.out.println("inside the if condition");
//			return dao;
//		}
//		return dao;
//	}
	
//@Autowired will take care of commented code	
	@Autowired
	private ProductDAO productDao;
	
	//ProductDAO productDao = ProductDAOImpl.getInstance();
	
	@Override
	public String createProduct(Product product) {
		// TODO Auto-generated method stub
		return productDao.createProduct(product);
	}

	@Override
	public Optional<Product> getProductById(int id) {
		// TODO Auto-generated method stub
		return productDao.getProductById(id);
	}

}
