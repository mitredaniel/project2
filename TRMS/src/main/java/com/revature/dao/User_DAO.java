package com.revature.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.beans.ReimbForm;
import com.revature.beans.User;
import com.revature.interfaces.I_UserDAO;
import com.revature.utility.SQL;

public class User_DAO implements I_UserDAO{
	
	// ---------------- get User  ----------------
	
				public User getUser(String login, String password) {
					
					User x = new User();
					
								
					try {
						Connection conn = SQL.getConnection();
						String sql = ("select * from tbl_user where login ='"+login+"' and password ='"+password+"'");
						
						Statement stmt = conn.createStatement();
						ResultSet rs = stmt.executeQuery(sql);
						
						while (rs.next()) {
						
							 x.setId(rs.getInt(1));
							 x.setfName(rs.getString(2));
							 x.setlName(rs.getString(3));
							 x.setLogin(rs.getString(4));
							 x.setPassword(rs.getString(5));
							 x.setRole(rs.getInt(6));
							 x.setEmail(rs.getString(7));
							 x.setReportTo(rs.getInt(8));
						}
						
						stmt.close();			
						 
					}catch (SQLException e) { e.printStackTrace(); }
					return x;					
				}	

}
