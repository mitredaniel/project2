package com.revature.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="p2_user")
public class P2User {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="userid", updatable = false, nullable = false)
	private int userid;
	
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
	
	@OneToOne
	@JoinColumn(name="userid")
	private P2Unit unit ;
	
	
	
	
	
	
	

	//----------------------------------------
	
	@Override
	
	public String toString() {
		return "P2User [userid=" + userid + ", fname=" + fname + ", lname=" + lname + ", login=" + login + ", password="
				+ password + ", role=" + role + "]";
	}

	//-------------------------------------------------
	
	public P2User() {
		super();
	}

	
	

	public P2User(int userid, String fname, String lname, String login, String password, String role, P2Unit unit) {
		super();
		this.userid = userid;
		this.fname = fname;
		this.lname = lname;
		this.login = login;
		this.password = password;
		this.role = role;
		this.unit = unit;
	}

	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}	


}
