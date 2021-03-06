package com.revature.utilities;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtilities {
	private static SessionFactory sessionFactory;
	
	static 
	{
		try {
			StandardServiceRegistry standardRegistry = 
					new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
			
			Metadata metaData = 
					new MetadataSources(standardRegistry).getMetadataBuilder().build();
			sessionFactory = metaData.getSessionFactoryBuilder().build();	
			
			} catch (HibernateException exception) {
				exception.printStackTrace();
			}
		
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
		
	}

}
