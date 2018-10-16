package com.revature.model;

import com.revature.interfaces.Card;
import com.revature.interfaces.IAccount;

public class SavingAccount implements IAccount{
	
	private Card atmCard;
	
	
	
	public SavingAccount(Card card) {
		atmCard = card;
	} 
	
	public String createAccount() {
		return "Saving Account Created Successfully";
	}

	@Override
	public String cardDetails() {
		// TODO Auto-generated method stub
		return atmCard.cardDetails();
	}
	

}
