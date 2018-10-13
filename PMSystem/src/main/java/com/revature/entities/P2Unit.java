package com.revature.entities;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="p2_unit")
public class P2Unit {
	
	@Id
	@Column(name="unitid")
	private int unitid;
	
	@Column(name="date_start")	
	private Date date_start;
	
	@Column(name="date_available")
	private Date date_available;
	
	@Column(name="unit_description")
	private String unit_description;
	
	@Column(name="occupied")
	private int occupied ;
	
	@Column(name="userid")
	private int userid;
	
	@Column(name="unitprice")
	private double unitprice;
	
	@OneToMany(mappedBy="unit", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private Set<P2Payment> paymentUnit = new HashSet<P2Payment>();
	
	@OneToMany(mappedBy="unitTicket", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private Set<P2_Ticket> residents = new HashSet<P2_Ticket>();
	
	
	
	
	//-----------------------------------------------
	
	
	@Override
	public String toString() {
		return "P2Unit [unitid=" + unitid + ", unit_description=" + unit_description + ", occupied=" + occupied
				+ ", userid=" + userid + ", unitprice=" + unitprice + "]";
	}
	
	//----------------------------------------------------------
	public P2Unit() {
		super();
		
	}


	public int getUnitid() {
		return unitid;
	}
	public void setUnitid(int unitid) {
		this.unitid = unitid;
	}
	public Date getDate_start() {
		return date_start;
	}
	public void setDate_start(Date date_start) {
		this.date_start = date_start;
	}
	public Date getDate_alailable() {
		return date_available;
	}
	public void setDate_alailable(Date date_alailable) {
		this.date_available = date_alailable;
	}
	public String getUnit_description() {
		return unit_description;
	}
	public void setUnit_description(String unit_description) {
		this.unit_description = unit_description;
	}
	public int getOccupied() {
		return occupied;
	}
	public void setOccupied(int occupied) {
		this.occupied = occupied;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public double getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}

}
