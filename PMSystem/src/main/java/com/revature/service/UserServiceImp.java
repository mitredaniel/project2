package com.revature.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.dao.UserDaoImp;
import com.revature.entities.P2User;
import com.revature.interfaces.I_UserService;

import antlr.collections.List;


@Service
public class UserServiceImp implements I_UserService {
	@Autowired
	private UserDaoImp uDao;
	
	
	public P2User verifyUser(String login, String password) {
		
		P2User u = uDao.verifyDao(login, password);
		return u;
	}
	
	
	public void setUserDao(UserDaoImp uDao) {
		this.uDao = uDao;
	}
	
	@Transactional
	public void addUser(P2User user) {
		this.uDao.addUser(user);
		
	}

	@Transactional
	public List listUser() {
		return this.uDao.listUser();
		
	}

	//@Transactional
	public P2User getUserById(int id) {
		
		
		
		return this.uDao.getUserById(id);
	}

}
