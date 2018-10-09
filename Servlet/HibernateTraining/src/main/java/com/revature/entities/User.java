package com.revature.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name="tbl_user")
public class User {

	@Id
	@Column(name="userid")
	@SequenceGenerator(name="serialuserid", sequenceName="serialuserid")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="serialuserid")
		
	private int userid;
	
	
	/*
	public Set<Reimbform> getForms() {
		return forms;
	}

	public void setForms(Set<Reimbform> forms) {
		this.forms = forms;
	}*/
	@Column(name="fname")
	private String fname;
	
	@Column(name="lname")
	private String lname;
	
	@Column(name="login")
	private String login;
	
	@Column(name="password")
	private String password;
	
	@Column(name="role")
	private String role;
	
	@Column(name="email")
	private String email;
	
	@Column(name="reportid")
	private int reportid;
	
	
	@OneToMany(mappedBy="fkuser", cascade=CascadeType.ALL)
	
	private List<Request> requestList = new ArrayList<Request>();
	
	// ---------- JOIN TABLES ------------------
	
	
	/*
	@OneToMany
	@JoinColumn(name="forignuserid")
	private Set<Reimbform> forms = new HashSet<Reimbform>();
	*/
	//-------------------------------------------------
	
	 
	
	
	
	//-------------------------------- to String ----------------------------
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(int userid, String fname, String lname, String login, String password, String role, String email,
			int reportid, Set<Reimbform> forms) {
		super();
		this.userid = userid;
		this.fname = fname;
		this.lname = lname;
		this.login = login;
		this.password = password;
		this.role = role;
		this.email = email;
		this.reportid = reportid;
		
	}


	public String getEmail() {
		return email;
	}
	
	
	public String getFname() {
		return fname;
	}


	public String getLname() {
		return lname;
	}

	public String getLogin() {
		return login;
	}
	public String getPassword() {
		return password;
	}
	public int getReportid() {
		return reportid;
	}
	public List<Request> getRequestList() {
		return requestList;
	}
	public String getRole() {
		return role;
	}
	//---------------------- getter and setter --------------------------------
	public int getUserid() {
		return userid;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setReportid(int reportid) {
		this.reportid = reportid;
	}
	public void setRequestList(List<Request> requestList) {
		this.requestList = requestList;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}


	@Override
	public String toString() {
		return "User [userid=" + userid + ", fname=" + fname + ", lname=" + lname + ", login=" + login + ", password="
				+ password + ", role=" + role + ", email=" + email + ", reportid=" + reportid + ", requestList="
				+ requestList + "]";
	}
	
	

}
