package com.tcs.ecommerce.utils;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// whenever we will come accross the Utility classes then we should mark these classes with @@Component
//singleton

@Component
public class DBUtils {
	
	@PostConstruct
	public void init() {
		System.out.println("init is called");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy is called");
	}
	
	@Autowired
	DataSource dataSource;
	
	public Connection getConnection() {
		
		Connection connection = null;
		
		try {
			connection = dataSource.getConnection();
			connection.setAutoCommit(false);
		} catch (SQLException e) {
			e.printStackTrace();
		}
//		Connection connection = null;
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			connection = DriverManager
//					.getConnection("jdbc:mysql://localhost:3306/TCS?userSSL=false", "root", "Prasad$008");
//			connection.setAutoCommit(false);
//			return connection;
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return connection;
		return connection;
	}
	
	public void closeConnection(Connection connection) {
		
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
