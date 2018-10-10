package com.revature.services;

import com.revature.beans.ReimbForm;
import com.revature.dao.ReimbForm_DAO;
import com.revature.interfaces.I_ReimbFormServices;

public class ReimbFormServices implements I_ReimbFormServices{

	public void newForm() {
		// TODO Auto-generated method stub
		
	}

	public void updateForm() {
		// TODO Auto-generated method stub
		
	}

	public void approveDenyForm() {
		// TODO Auto-generated method stub
		
	}

	 
		
		 	 

	public ReimbForm viewForm(int rfid) {
		 ReimbForm_DAO rfdao = new ReimbForm_DAO();
		 ReimbForm rf  = new ReimbForm();
		 rf = rfdao.viewForm(rfid);
		 
		return rf;
	}
	

}
