package com.yash.service;

import com.yash.pojo.User;

public interface UserService {

	public void saveUser(User user);
	public User getUser(String email, String password);
}
