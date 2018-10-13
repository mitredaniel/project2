package com.revature.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "p2_ticket")
public class P2_Ticket {

	@Id
	@Column(name = "ticketid")
	private int ticketid;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="description")
	private String description;
	
	@Column(name="status")
	private String status;
	
	@Column(name="unitid")
	private int unitid;
	
	@Column(name="userid")
	private int userid;
	
	@Column(name="worker_comment")
	private String worker_comment;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="unitid", insertable=false, updatable=false)
	private P2Unit unitTicket;

	/**
	 * 
	 */
	public P2_Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "P2_Ticket [ticketid=" + ticketid + ", date=" + date + ", description=" + description + ", status="
				+ status + ", unitid=" + unitid + ", userid=" + userid + ", worker_comment=" + worker_comment + "]";
	}

	public int getTicketid() {
		return ticketid;
	}

	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getUnitid() {
		return unitid;
	}

	public void setUnitid(int unitid) {
		this.unitid = unitid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getWorker_comment() {
		return worker_comment;
	}

	public void setWorker_comment(String worker_comment) {
		this.worker_comment = worker_comment;
	}
}
