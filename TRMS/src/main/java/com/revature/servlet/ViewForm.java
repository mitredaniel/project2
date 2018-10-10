package com.revature.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.beans.ReimbForm;
import com.revature.services.ReimbFormServices;

public class ViewForm extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private static ReimbFormServices rfs = new ReimbFormServices(); // services
	ReimbForm rf = new ReimbForm(); // reimbForm object
	ObjectMapper om = new ObjectMapper();
	
    public ViewForm() {
        super();
       
    }
	 
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("first step in doGet this is the ViewForm Servlet - inside");
		
		HttpSession sess = req.getSession(false);
		String login = (String)sess.getAttribute("login");
		String password = (String)sess.getAttribute("password");
		int userId = (Integer)sess.getAttribute("userId");
		
		System.out.println("lgoin :    "+login);
		System.out.println("password : "+password);
		System.out.println("userId :   "+userId);
		
		rf = rfs.viewForm(userId);
		System.out.println("this is the form form database.... "+rf.toString());
		String sRF = om.writeValueAsString(rf);
		//resp.sendRedirect("viewForm.html");
		resp.getWriter().write(sRF);
				System.out.println("last step of doGet ViewForm");
	}
	 
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//HttpSession sess = req.getSession(false);	
		//resp.sendRedirect("viewForm.html");
		
		System.out.println("this is first step ViewForm servlet (doPost)");
		
		HttpSession sess = req.getSession(false);
		String login = (String)sess.getAttribute("login");
		String password = (String)sess.getAttribute("password");
		int userId = (Integer)sess.getAttribute("userId");
		
		System.out.println("lgoin :    "+login);
		System.out.println("password : "+password);
		System.out.println("userId :   "+userId);
		
		rf = rfs.viewForm(userId);
		System.out.println(rf.toString());
		String sRF = om.writeValueAsString(rf);
		resp.sendRedirect("viewForm.html");
		System.out.println("doPost sent the viewForm.html");
		//System.out.println("inside doPost ViewForm");
	}

}
