package com.revature.interfaces;

import com.revature.entities.P2User;

import antlr.collections.List;

public interface I_UserDAO {
	public void addUser(P2User u);
	public List listUser();
	public P2User getUserById(int id);
}
