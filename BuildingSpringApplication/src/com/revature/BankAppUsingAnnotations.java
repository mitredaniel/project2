package com.revature;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.revature.interfaces.IAccount;

public class BankAppUsingAnnotations {

		private static ApplicationContext context;
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		context = new AnnotationConfigApplicationContext(BankAppConfig.class);
		IAccount account = context.getBean("currentAccount",IAccount.class);
		System.out.println(account.createAccount());
		System.out.println(account.cardDetails());
	}

}
