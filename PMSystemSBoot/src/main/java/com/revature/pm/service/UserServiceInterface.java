package com.revature.pm.service;

import java.util.List;

import com.revature.pm.entities.User;

public interface UserServiceInterface {
	
	 
	public List<User> getAllUser();
	public void createUser(User u);
	 
}
