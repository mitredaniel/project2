package com.revature.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Employee extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Employee() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			  PrintWriter pw = response.getWriter();
			  response.setContentType("text/html");
			  pw.write("fName");
			  response.sendRedirect("employee.html");
			
		
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().append("fName : ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		HttpSession sess = request.getSession(false);
		  if(sess == null) {
			  response.sendRedirect("login.html");
		  }
		  else {
			  String fName = (String) sess.getAttribute("fName");
			  out.println("<h1>do something</h1>"+fName);
		  } 
		doGet(request, response);
	}

}
