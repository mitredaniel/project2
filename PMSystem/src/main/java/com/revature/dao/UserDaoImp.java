package com.revature.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.revature.entities.P2User;
import com.revature.interfaces.I_UserDAO;

import antlr.collections.List;

@Repository
public class UserDaoImp implements I_UserDAO{

		//private static final org.slf4j.Logger logger = LoggerFactory.getLogger(UserDaoImp.class);
		
		
		
		public void addUser(P2User user) {
			
			Configuration c = new Configuration();
			c.configure("hibernate.cfg.xml");
			SessionFactory sf = c.buildSessionFactory();
			Session s = sf.openSession();
			Transaction tx = s.beginTransaction();
			
			try
			{
				s.save(user);
				s.flush();
				tx.commit();
				
			} catch (Exception e)
			
			{
				tx.rollback();
			}
			
			
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
