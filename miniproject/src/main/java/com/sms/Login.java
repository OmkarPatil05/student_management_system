package com.sms;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.sms.dao.Dao;
import com.sms.model.Admin;
import com.sms.model.Student;


public class Login extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	{
		String name = request.getParameter("username");
		int rollNumber = Integer.parseInt( request.getParameter("rollNumber") );
		long phoneNumber = Long.parseLong(request.getParameter("phoneno"));
		String branch = request.getParameter("branch");
		String year = request.getParameter("year");
		
		Dao dao = new Dao();
		@SuppressWarnings("unused")
		Student student;
		student = dao.getStudent(name, phoneNumber, rollNumber, branch, year);
		try
		{
		response.sendRedirect("admin.jsp");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	{ 
		try
		{
			
			
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		
		
		Dao dao = new Dao();
		Admin admin;
		admin = dao.getAdmin(username);
		
		if(username.equals(admin.getUsername()) && password.equals(admin.getPassword()))
		{
			response.sendRedirect("admin.jsp");
			HttpSession session = request.getSession();
			session.setAttribute("username",username);
		}
		else
		{
			response.sendRedirect("home.jsp");
		}
		}
		catch(Exception e)
		{
			System.err.println("exception"+e);
		}
	}

}
