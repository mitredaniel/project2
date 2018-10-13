package com.revature.dao;


import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.revature.entities.P2User;
import com.revature.interfaces.I_UserDAO;
import com.revature.utilities.HibernateUtilities;

import antlr.collections.List;

@Repository
public class UserDaoImp implements I_UserDAO{

		//private static final org.slf4j.Logger logger = LoggerFactory.getLogger(UserDaoImp.class);
		
		
		
		public void addUser(P2User u) {
			SessionFactory session = (SessionFactory)HibernateUtilities.getSession();
		 
			Session sadduser = session.openSession();
			sadduser.persist(u);
						
			//logger.info("User saved successfully, User Details =" + u);	
		}

		
		public List listUser() {
			return null;
		
		}

		public P2User getUserById(int id) {
			//Session session = this.sessionFactory.getCurrentSession();
		//	P2User u = (P2User)session.load(P2User.class, new Integer(id));
		//	logger.info("User loades successfully, User details = "+ u);
			return null ;
		}
		
		
}
