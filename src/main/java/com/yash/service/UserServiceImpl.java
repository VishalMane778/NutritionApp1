package com.yash.service;

import com.yash.dao.UserDAOImpl;
import com.yash.pojo.User;

public class UserServiceImpl implements UserService{

	UserDAOImpl userDAO = new UserDAOImpl();
	
	public void saveUser(User user) {
		userDAO.saveUser(user);
	}

	@Override
	public User getUser(String email, String password) {
		return userDAO.getUser(email, password);
	}

	
}
