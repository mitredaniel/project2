package com.revature.driver;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

import com.revature.dao.UnitDaoImp;
import com.revature.dao.UserDaoImp;
import com.revature.entities.P2Unit;
import com.revature.entities.P2User;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 P2User u = new P2User();
		 UserDaoImp udao = new UserDaoImp();
		 
		 u = udao.verifyDao("jm", "123");
		 System.out.println(u.toString());
	}

}
