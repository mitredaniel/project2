package com.revature.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.revature.bean.utility.HibernateUtilities;
import com.revature.entities.Reimbform;
import com.revature.entities.Request;
import com.revature.entities.User;

public class Program {

	public static void main(String[] args) {
		 System.out.println("Driver......");
		 
		 Session session = HibernateUtilities.getSessionFactory().openSession();
		//SessionFactory session = (SessionFactory) HibernateUtilities.getSession().openSession();
		System.out.println("it works");
		//System.out.println(session.get(User.class, 104));
		User u = session.get(User.class, 102);
		System.out.println(u.toString());
		
		String lastname = u.getLname();
		System.out.println(lastname);
		System.out.println(u.toString());
		
		
		System.out.println("-------------------------------------------");
		System.out.println("welcome " + u.getFname() + " " + u.getLname());
		
		System.out.println("Here is your list of request:");
		for(Request x: u.getRequestList()) {
			System.out.println("request id: " + x.getRequestid());
			System.out.println("Description: "+ x.getDescription());
			System.out.println(x.getUserid());
			
		}
		
		System.out.println();
		
		
		session.close();
		
	}

}