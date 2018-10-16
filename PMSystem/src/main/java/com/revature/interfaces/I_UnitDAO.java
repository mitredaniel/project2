package com.revature.interfaces;

import java.sql.Date;
import java.util.List;

import com.revature.entities.P2Unit;

public interface I_UnitDAO {
	
	public void rentUnit(int userid, Date dstart, Date davailable, int occupied, int unitid);
	public List<P2Unit> availableUnit();
	public List<P2Unit> occupiedUnit();

}
