package com.revature.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.services.UserServices;
 
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static UserServices us = new UserServices();   
     
    public UserServlet() {
        super();
        
    }

	 
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		//resp.getWriter().append("Served at: ").append(req.getContextPath());
		System.out.println(req.getPathInfo());
		String login = req.getPathInfo().substring(1);
		String password = req.getPathInfo().substring(2); 
		ObjectMapper om =new ObjectMapper();
		String userString = om.writeValueAsString(us.getUser(login, password));
		resp.getWriter().write(userString);
	}

	 
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 
		doGet(req, resp);
	}

}
