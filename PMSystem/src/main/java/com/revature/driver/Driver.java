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
		List<P2Unit> listunit ;
		 String da = "2019-10-10";
		 String ds = "2018-10-10";
		Date dstart = Date.valueOf(ds);
		Date davail = Date.valueOf(da);
	
		
		
		 
		
		//UserDaoImp dao = new UserDaoImp();
		//dao.addUser(u);
		
		 UnitDaoImp udao = new UnitDaoImp();
		 
		// udao.rentUnit(1, dstart, davail, 1, 2200);
		System.out.println("successful inserted");
		udao.availableUnit();
		listunit = udao.occupiedUnit();
		
		for (P2Unit p: listunit) {
			System.out.println(p.getUnitid() + "available :" + p.getDate_alailable());
		}
		
	}

}
