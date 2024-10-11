package com.yash.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	private static String url = "jdbc:mysql://localhost:3306/nutritionApp";
	private static String user = "root";
	private static String password = "Password@2024";
	
	
	static {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		}
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url, user, password);
				
	}
	
	
	

}
