package com.revature.services;

import com.revature.beans.User;
import com.revature.dao.User_DAO;
import com.revature.interfaces.I_UserServices;

public class UserServices implements I_UserServices{
	 
	public User getUser(String login, String password) {
		User newUser = new User();
		User_DAO udao = new User_DAO();
		newUser = udao.getUser(login, password);
		return newUser;		
	}	
}
