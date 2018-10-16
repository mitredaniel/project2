package com.revature;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.interfaces.IAccount;

public class MyBankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SavingAccount account = new SavingAccount();
		//CurrentAccount caccount = new CurrentAccount();
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		IAccount account = context.getBean("myAccount", IAccount.class);
		
	System.out.println(account.createAccount());
		System.out.println(account.cardDetails());
		context.close();
	}

}
