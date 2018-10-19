package com.revature.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.dao.UnitDaoImp;
import com.revature.entities.P2Unit;
import com.revature.interfaces.I_UnitService;


@Service
public class UnitServiceImp implements I_UnitService {
	@Autowired
	private UnitDaoImp uDao;
	
	public void setUnitDao(UnitDaoImp uDao) {
		this.uDao = uDao;
	}
	
	@Transactional
	public void rentUnit(int userid, Date dstart, Date davailable, int occupied, int unitid) {
		 this.uDao.rentUnit(userid, dstart, davailable, occupied, unitid);
		
	}
	
	@Transactional
	public List<P2Unit> availableUnit() {
		
		return this.uDao.availableUnit();		
		
	}

	public List<P2Unit> occupiedUnit() {
		return this.uDao.occupiedUnit();
	}

	
	
	

}
