package com.yash.test;
import java.sql.*;

import com.yash.util.*;
public class Test {

	public static void main(String [] args) {
		
		try {
			Connection con = DBUtil.getConnection();
			if(con!=null) {
				System.out.println("Connection Established");
			} else {
				System.out.println("Connection Failed");
			} 
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
