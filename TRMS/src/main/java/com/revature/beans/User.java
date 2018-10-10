package com.revature.beans;

public class User {
	private int id;
	private String fName;
	private String lName;
	private String fullName = fName + " " + lName;
	private String login;
	private String password;
	private int role;
	private String email;
	private int reportTo;
	
	public User() {
		
	}
	
public User(int id, String fName, String lName, String login, String password, int role, String email, int reportTo) {
	fullName = fName + " " + lName;
	this.login = login;
	this.password = password;
	this.role= role;
	this.email = email;
	this.reportTo = reportTo;
		
	}

// ------------------------- setter | getters -------------------------------

	public int getId() {
		return id;
	}

	public String getFullName() {
		return fullName;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	public int getRole() {
		return role;
	}

	public String getEmail() {
		return email;
	}

	public int getReportTo() {
		return reportTo;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setReportTo(int reportTo) {
		this.reportTo = reportTo;
	}
	
	//----------------------------------------------------------------------------------
	
	@Override
	public String toString() {
		return "User [id=" + id + ", fName=" + fName + ", lName=" + lName + ", fullName=" + fullName + ", login="
				+ login + ", password=" + password + ", role=" + role + ", email=" + email + ", reportTo=" + reportTo
				+ "]";
	}




}
