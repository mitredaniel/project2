package com.revature.utilities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtilities {
	private static SessionFactory sessionFactory;
	
	static {
		StandardServiceRegistry standarRegistry =
				new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		
		Metadata metaData = new MetadataSources(standarRegistry).getMetadataBuilder().build();
		
		sessionFactory = metaData.getSessionFactoryBuilder().build();
		
	}
	
	public static Session getSession() {
		return sessionFactory.openSession();
	}
}
