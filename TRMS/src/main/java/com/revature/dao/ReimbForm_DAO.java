package com.revature.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;

import com.revature.beans.ReimbForm;
import com.revature.interfaces.I_ReimbFormDAO;
import com.revature.utility.SQL;

public class ReimbForm_DAO implements I_ReimbFormDAO{
	
	// ---------------- insert New form ----------------
	
	public void newReimForm(ReimbForm x) {
		String description, location, workRelated;
		int userId, aproveStatus, grade, typeEvent;
		
		double total;
		
		userId = 102; //x.getUserId();
		java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime()); // x.getDateIni();
		description = "class to get certificate"; // x.getDescription();
		location = "210 creeck road ponte vedra fl 32081"; //x.getLocation();
		total = 1000.00;
		aproveStatus = 0; //x.getApprovalStatus();
		grade = 80; //x.getGrading();
		typeEvent = 50;  //x.getEventType();
		workRelated = "development department"; //x.getWorkRelated();
		
		
		try {
			Connection conn = SQL.getConnection();
			String sql = "insert into tbl_reimbform (userid,dateini,description,location,total,"
					+ "aprovestatus,grading,type_event,work_related) "
					+ "values (?,?,?,?,?,?,?,?,?)";  
			
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1,userId);
			stmt.setDate(2,date);
			stmt.setString(3,description);
			stmt.setString(4,location);
			stmt.setDouble(5,total);
			stmt.setInt(6,aproveStatus);
			stmt.setInt(7,grade);
			stmt.setInt(8,typeEvent);
			stmt.setString(9,workRelated);
					 
			stmt.executeUpdate();
			stmt.close();
			
		}catch (SQLException e) { e.printStackTrace(); }		
	}
	
	// ---------------- update status in the form ----------------
	
		public void updateStatus(ReimbForm x, int status) {
			
			
			int rfid  = 2002; //x.getRfId();
						
			try {
				Connection conn = SQL.getConnection();
				String sql = "update tbl_reimbform set aprovestatus = ? where rfid = ?";
				
				PreparedStatement stmt = conn.prepareStatement(sql);
				stmt.setInt(1,status);
				stmt.setInt(2,rfid);
						 
				stmt.executeUpdate();
				stmt.close();
				
			}catch (SQLException e) { e.printStackTrace(); }		
		}
	
		
		// ---------------- View Form  ----------------
		
			public ReimbForm viewForm(int rfid) {
				
				ReimbForm x = new ReimbForm();
							
				try {
					Connection conn = SQL.getConnection();
					String sql = ("select * from tbl_reimbform where userid ='"+rfid+"'");
					
					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
					
					while (rs.next()) {
						x.setRfId(rs.getInt(1));
						x.setUserId(rs.getInt(2));
						x.setDateIni(rs.getDate(3));
						x.setDateUpdate(rs.getDate(4));
						x.setDescription(rs.getString(5));
						x.setLocation(rs.getString(6));
						x.setCity(rs.getString(7));
						x.setTotalAmount(rs.getDouble(8));
						x.setTotalAwared(rs.getDouble(9));
						x.setTotalPending(rs.getDouble(10));
						x.setApprovalStatus(rs.getInt(11));
						x.setGrading(rs.getInt(12));
						x.setEventType(rs.getInt(13));
						x.setWorkRelated(rs.getString(14));						
					}
					
					stmt.close();			
					 
				}catch (SQLException e) { e.printStackTrace(); }
				return x;					
			}	
}











