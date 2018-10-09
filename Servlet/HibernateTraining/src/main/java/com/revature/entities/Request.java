package com.revature.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_request")
public class Request {
	
	@Id
	@Column(name="requestid")
	private int requestid;
	
	@Column(name="description")
	private String description;
	
	@Column(name="userid")
	private int userid;
	
	@ManyToOne()
	@JoinColumn(name="userid", updatable = false, insertable = false)
	private User fkuser;
	
	
	//------------------------------------
	
	
	public User getFkuser() {
		return fkuser;
	}
	public void setFkuser(User fkuser) {
		this.fkuser = fkuser;
	}
	public int getRequestid() {
		return requestid;
	}
	@Override
	public String toString() {
		return "Request [requestid=" + requestid + ", description=" + description + ", userid=" + userid + "]";
	}
	public Request(int requestid, String description, int userid) {
		super();
		this.requestid = requestid;
		this.description = description;
		this.userid = userid;
	}
	public void setRequestid(int requestid) {
		this.requestid = requestid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	/**
	 * @param requestid
	 * @param description
	 * @param userid
	 * @param fkuser
	 */
	public Request(int requestid, String description, int userid, User fkuser) {
		super();
		this.requestid = requestid;
		this.description = description;
		this.userid = userid;
		this.fkuser = fkuser;
	}
	/**
	 * 
	 */
	public Request() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
