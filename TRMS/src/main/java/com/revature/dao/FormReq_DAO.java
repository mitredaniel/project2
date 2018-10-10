package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.revature.beans.FormReq;
import com.revature.beans.ReimbForm;
import com.revature.interfaces.I_FormReqDAO;
import com.revature.utility.SQL;

public class FormReq_DAO implements I_FormReqDAO {
	
	//-----------------  insert new form req -------------------------------
	public void insertReq(ReimbForm x, int requestedBy) {
		
		int userId = 101; //x.getUserId();
		int rfid =  2001; //x.getRfId();
		java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
		String description = "we need the grade please"; //x.getDescription();
		int completed = 0;
		try {
			Connection conn = SQL.getConnection();
			String sql = "insert into tbl_rimbform_req (userid, rfid, date,description,requestedby,completed) "
					+ "values (?,?,?,?,?,?)";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1,userId );
			stmt.setInt(2,rfid);
			stmt.setDate(3,date);
			stmt.setString(4,description);
			stmt.setInt(5,requestedBy);
			stmt.setInt(6,completed);
			
			stmt.executeUpdate();
			stmt.close();
		}catch(SQLException e) {e.printStackTrace();}
		
	}
	
	//-----------------  update status in the form req. -------------------------------
	
			public void updateFRStatus(FormReq x, int status) {
				
				int reqId = 10; //x.getReqId();
				
				try {
					Connection conn = SQL.getConnection();
					String sql = "update tbl_rimbform_req set completed = ? where reqid = ?";
					
					PreparedStatement stmt = conn.prepareStatement(sql);
					stmt.setInt(1,status);
					stmt.setInt(2,reqId);
							 
					stmt.executeUpdate();
					stmt.close();
					
				}catch (SQLException e) { e.printStackTrace(); }		
			}
			
	// ---------------- return list of form requirement  ----------------
			
			public List<FormReq> viewFormReq(ReimbForm x) {
				
					int rfid = x.getRfId();
					int numberOfFReq = countFReq(x);
					 
					FormReq[] n = new FormReq[numberOfFReq];
					List<FormReq> myList = new ArrayList();
								
					try {
						Connection conn = SQL.getConnection();
						String sql = ("select * from tbl_rimbform_req where rfid ='"+rfid+"'");
						
						Statement stmt = conn.createStatement();
						ResultSet rs = stmt.executeQuery(sql);
						
						while (rs.next()) {
							
							for(int i =1 ; i<numberOfFReq; i++) {
								n[i]=new FormReq();
								n[i].setReqId(rs.getInt(1));
								n[i].setUserId(rs.getInt(2));
								n[i].setRfId(rs.getInt(3));
								n[i].setDate(rs.getDate(4));
								n[i].setDescription(rs.getString(5));
								n[i].setRequestedBy(rs.getInt(6));
								n[i].setCompleted(rs.getInt(7));
								myList.add(n[i]);								
							}
						}
						
						stmt.close();			
						 
					}catch (SQLException e) { e.printStackTrace(); }
					return myList;					
				}	
	
          // ----------------------------------- count req form ----------------------------
			
			public int countFReq(ReimbForm x) {
				int frCount =0;
				int rfId =  x.getRfId();
				try {
					Connection conn =SQL.getConnection();
					String sql = ("select count(*) from tbl_rimbform_req where rfid = '"+rfId+"'");
					
					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
					
					while (rs.next()) {
						  frCount = rs.getInt(1);
					}
					 
				}catch(SQLException e) {e.printStackTrace();}
				return frCount;
			}
			
}


























