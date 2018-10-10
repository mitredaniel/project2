package com.revature.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.beans.User;
import com.revature.services.UserServices;

public class LoginServlet extends HttpServlet{
 
	private static final long serialVersionUID = 1L;
	private static  UserServices us= new UserServices();
	ObjectMapper om = new ObjectMapper();
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws IOException, ServletException{
		
		System.out.println("this is the doget method....");
		
		HttpSession sess = req.getSession(false) ;
		
		
		 		String login = (String) sess.getAttribute("login");
		 		String password = (String) sess.getAttribute("password");
				User u = new User();
				System.out.println("inside doGet login..."+u.toString());
				u = us.getUser(login,password);
				System.out.println(u.toString());
				String sUser = om.writeValueAsString(u);
				resp.getWriter().write(sUser);
				
				System.out.println("last step in doGetLogin");
	}
	
protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws IOException, ServletException{
	
	System.out.println("this is doPost Login in servlet");
	 
	String login = req.getParameter("userLogin");
	String password = req.getParameter("userPassword");
	
	//System.out.println("welcome :" +login + " password : "+ password);
	
	  User u = new User();
	  u = us.getUser(login,password);
	  
	  System.out.println(u.toString());
	 
	 
	 int role = u.getRole();
	  
	  HttpSession sess =  req.getSession(true);
	  
	  
	  sess.setAttribute("login", u.getLogin());
	  sess.setAttribute("password", u.getPassword());
	  sess.setAttribute("userId", u.getId() );
	 
	  
	 /*/ resp.setContentType("text/html");    
	  
	  String sFName = (String)sess.getAttribute("fName");
	  String sLName = (String)sess.getAttribute("lNmae");
	  String sFullName = sFName + " " + sLName;
	  
	  PrintWriter writer = resp.getWriter();
	   
	  writer.print("Welcome " + sFullName); 
	  
	 /* writer.println("<a href ='employee.html'>visit</a>");
	  writer.println("<h2> fName: "+u.getfName()+ "</h2>");
	 
	
	  
	  switch(role) {
	  case 1: {	 
	  			 
		  		//req.getRequestDispatcher("employee.html").forward(req, resp);
		  		resp.sendRedirect("employee.html");
		     	break;
	  }
	  case 2: resp.sendRedirect("approver.html");
	  			break;
	  case 3: resp.sendRedirect("approver.html");
		break;
	  case 4: resp.sendRedirect("approver.html");
		break;
	  default: resp.sendRedirect("login.html");
	  }  */  
	resp.sendRedirect("employee.html");
	System.out.println("sendRedirect to employee.html");
	
}

}


















