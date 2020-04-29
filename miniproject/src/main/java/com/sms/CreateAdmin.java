package com.sms;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sms.cipher.Caeser;
import com.sms.dao.Dao;


public class CreateAdmin extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String adminName = request.getParameter("adminName");
		String adminPassword = request.getParameter("adminPassword");
		
		
		Caeser caeser = new Caeser();
		
		adminName = caeser.encrypt(adminName);
		adminPassword = caeser.encrypt(adminPassword);
		
		Dao dao = new Dao();
		dao.createAdmin(adminName, adminPassword);
		response.sendRedirect("home.jsp");
		
		System.out.println("admin : "+adminName+"\n password : "+adminPassword);
	}

}
