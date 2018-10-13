package com.revature.driver;

import com.revature.dao.UserDaoImp;
import com.revature.entities.P2User;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 P2User u = new P2User();
		 u.setFname("Robert");
		 u.setLname("Ribs");
		 u.setLogin("rr.com");
		 u.setPassword("123");
		 u.setRole("tenants");
	
		
		
		UserDaoImp dao = new UserDaoImp();
		dao.addUser(u);
		
		System.out.println("successful inserted");

	}

}
