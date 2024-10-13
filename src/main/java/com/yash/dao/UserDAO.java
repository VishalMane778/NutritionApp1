package com.yash.dao;

import com.yash.pojo.User;

public interface UserDAO {

	public void saveUser(User user);
	User getUser(String name, String password);
	
}
