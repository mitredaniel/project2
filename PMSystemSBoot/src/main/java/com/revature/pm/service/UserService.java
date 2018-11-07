package com.revature.pm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.pm.entities.User;
import com.revature.pm.repository.UserRepository;

@Service
public class UserService implements UserServiceInterface {
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public List<User> getAllUser() {
		 
		return userRepo.findAll();
	}

	@Override
	public void createUser(User u) throws IllegalArgumentException {
		
		// check for notNull field 
		
		if (u.getFname()== null) {throw new IllegalArgumentException("fName was null");}
		
		if (u.getLname()== null) {throw new IllegalArgumentException("lName was null");}
		
		if (u.getLogin()== null) {throw new IllegalArgumentException("login was null");}
		
		if (u.getPassword()== null) {throw new IllegalArgumentException("password was null");}
		
		if (u.getRole()== null) {throw new IllegalArgumentException("role was null");}
					
		userRepo.save(u);
		
	}

}
