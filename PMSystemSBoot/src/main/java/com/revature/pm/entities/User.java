package com.revature.pm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * User entity that hold information about user: tenants, manager, maintenance, owner; based on the user role.
 * @author Daniel
 *
 */

@Entity
@Table(name="tbl_user")
public class User {	
		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		@Column(name="userid", updatable = false, nullable = false)
		private int userid;
		
		@Column(name="fname")
		@NotNull
		private String fname;
		
		@Column(name="lname")
		@NotNull
		private String lname;
		
		@Column(name="login")
		@NotNull
		private String login;
		
		@Column(name="password")
		@NotNull
		private String password;
		
		@Column(name="role")
		@NotNull
		private String role;
		
		@Column(name="unitId")
		private String unitId;
		
		
		/**
		 * Constructor that hold information about user.
		 * @param userid 
		 * @param fname
		 * @param lname
		 * @param login
		 * @param password
		 * @param role
		 * @param unitId
		 */
		public User(int userid, @NotNull String fname, @NotNull String lname, @NotNull String login,
				@NotNull String password, @NotNull String role, String unitId) {
			super();
			this.userid = userid;
			this.fname = fname;
			this.lname = lname;
			this.login = login;
			this.password = password;
			this.role = role;
			this.unitId = unitId;
		}

		/**
		 * Return an integer that hold user id.
		 * @return userid 
		 */
		public int getUserid() {
			return userid;
		}

		/**
		 * Set an integer as a user id.
		 * @param userid
		 */
		public void setUserid(int userid) {
			this.userid = userid;
		}
		
		/**
		 * Get string as a user first name.
		 * @return
		 */
		public String getFname() {
			return fname;
		}

		/**
		 * Return a String as user first name.
		 * @param fname
		 */
		public void setFname(String fname) {
			this.fname = fname;
		}
		
		/**
		 * Return a String as the user last name.
		 * @return
		 */
		public String getLname() {
			return lname;
		}

		/**
		 * Set a String as the user last name.
		 * @param lname
		 */
		public void setLname(String lname) {
			this.lname = lname;
		}

		/**
		 * Get a String as the user login.
		 * @return
		 */
		public String getLogin() {
			return login;
		}

		/**
		 * Set a String as the user login.
		 * @param login
		 */
		public void setLogin(String login) {
			this.login = login;
		}
		
		/**
		 * Return a String as the user login.
		 * @return
		 */
		public String getPassword() {
			return password;
		}

		/**
		 * Set a String as the user password.
		 * @param password
		 */
		public void setPassword(String password) {
			this.password = password;
		}

		/**
		 * Get a String as user role.
		 * @return
		 */
		public String getRole() {
			return role;
		}

		/**
		 * Set a String as the user role.
		 * @param role
		 */
		public void setRole(String role) {
			this.role = role;
		}
		
		/**
		 * Get an Integer as the unit id.  used as foreign key.
		 * @return
		 */
		public String getUnitId() {
			return unitId;
		}

		/**
		 * Set an Integer as the unit id.  
		 * @param unitId
		 */
		public void setUnitId(String unitId) {
			this.unitId = unitId;
		}

		/**
		 * Return the user object as an String.
		 */
		@Override
		public String toString() {
			return "User [userid=" + userid + ", fname=" + fname + ", lname=" + lname + ", login=" + login
					+ ", password=" + password + ", role=" + role + ", unitId=" + unitId + "]";
		}
		
		
		
	
	
	

}
