package com.revature.beans;

import java.util.ArrayList;
import java.util.List;

import com.revature.dao.FormReq_DAO;
import com.revature.dao.ReimbForm_DAO;
import com.revature.dao.User_DAO;

public class Driver {
 
	
	
	public static void main(String[] args) {
	 
	List<FormReq> frList = new ArrayList();	
	ReimbForm x = new ReimbForm();
	 x.setRfId(2002);
	 
	 User u = new User();
	 
	 ReimbForm_DAO xDAO = new ReimbForm_DAO();
	 User_DAO uDAO = new User_DAO();
	 FormReq_DAO fr = new FormReq_DAO();
	 
	 
	// xDAO.newReimForm(x);
	 xDAO.updateStatus(x, 1);
	 System.out.println("here is something");
	 
	// x = xDAO.viewForm(2003);
	
	// u = uDAO.getUser("ev","123");
	// System.out.println(u.toString());
	 
	 //fr.insertReq(x,104);	 
	 //int count = fr.countFReq(x);
	 //System.out.println("reimbusement form number" + x.getRfId()+ "number of requirements "+ count);
	 frList = fr.viewFormReq(x);
	 for(FormReq n: frList) {
		 System.out.println(n.toString());
	 }
 }
	
	
	
}
