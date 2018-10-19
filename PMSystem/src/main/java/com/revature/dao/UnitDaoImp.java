package com.revature.dao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.revature.entities.P2Unit;
import com.revature.interfaces.I_UnitDAO;
@Repository
public class UnitDaoImp implements I_UnitDAO {

	
	public void rentUnit(int userid, Date dstart, Date davailable, int occupied, int unitid) {
	 
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		P2Unit unit = (P2Unit)s.get(P2Unit.class, unitid);
		
		if (unit.getOccupied()==0) {
			
			try {
			unit.setDate_start(dstart);
			unit.setDate_alailable(davailable);
			unit.setOccupied(1);
			unit.setUserid(userid);
			s.update(unit);
			tx.commit();
			} catch (Exception e)
			
			{
				tx.rollback();
			}
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public List<P2Unit> occupiedUnit() {
	/*	Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		String hql="from P2Unit log where log.occupied = 1";
		//Query q = s.createQuery(hql);
		List<P2Unit> result = (List<P2Unit>) s.createQuery(hql).list();
		for (P2Unit x: result) {
			System.out.println(x);
		}
		*/
		
		
		P2Unit u1 = new P2Unit();
		u1.setOccupied(1);
		
		P2Unit u2 = new P2Unit();
		u2.setOccupied(1);
		
		List<P2Unit> myList = new ArrayList();
		myList.add(u1);
		myList.add(u2);
		
		return myList;
		
		}

	
	public List<P2Unit> availableUnit() {
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		String hql="from P2Unit log where log.occupied = 0";
		//Query q = s.createQuery(hql);
		@SuppressWarnings("unchecked")
		List<P2Unit> result = (List<P2Unit>) s.createQuery(hql).list();
		for (P2Unit x: result) {
			System.out.println(x);
		}
		return result;
	 }
	}
