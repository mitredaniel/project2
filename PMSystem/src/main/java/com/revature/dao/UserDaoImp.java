package com.revature.dao;


import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.revature.entities.P2User;
import com.revature.interfaces.I_UserDAO;

import antlr.collections.List;

@Repository
public class UserDaoImp implements I_UserDAO  {
	
/*	
	private Session session;
	public UserDaoImp () {
		session = (Session) HibernateUtilities.getSessionFactory();
	}
*/
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
			
			
			Configuration c = new Configuration();
			c.configure("hibernate.cfg.xml");
			SessionFactory sf = c.buildSessionFactory();
			Session s = sf.openSession();
			Transaction tx = s.beginTransaction();
			
			
			P2User u = null;
			u = s.get(P2User.class, id);
			
			return u ;
		}
		
		public P2User verifyDao(String login, String password) {
			
			Configuration c = new Configuration();
			c.configure("hibernate.cfg.xml");
			SessionFactory sf = c.buildSessionFactory();
			Session s = sf.openSession();
			Transaction tx = s.beginTransaction();
			
			P2User u = null;
			
			/*Query query = s.createSQLQuery("select * from p2_user where login = '" + login + "';");
			u = (P2User) query.getResultList().get(0);*/
			
			
			SQLQuery query = s.createSQLQuery("select * from p2_user where login = '" + login + "';");
			query.addEntity(P2User.class);
			u = (P2User) query.getResultList().get(0);
			
			if (u.getPassword().equals(password)){
				return u;
			}
					return null ;
		}
		
		
		
		
}
