package com.revature.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQL {
	public static Connection getConnection()throws SQLException {
		String url = "jdbc:postgresql://localhost:5432/postgres?";
		 
		String user = "postgres";
		String password = "";
		
		
		postgress();
		
		return DriverManager.getConnection(url, user, password);		
	}
	
	//---------------------------- tomcat connection ------------------
	public static void postgress() {
	try {
        Class.forName("org.postgresql.Driver");
    } catch (ClassNotFoundException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
    }
	}
	//-------------------------------------------------------------
	
}
