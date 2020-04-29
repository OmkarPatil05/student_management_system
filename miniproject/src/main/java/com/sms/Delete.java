package com.sms;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sms.dao.Dao;


public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name = request.getParameter("username");
		int rollNumber = Integer.parseInt(request.getParameter("rollNumber"));
		
		Dao dao = new Dao();
		dao.delete(name,rollNumber);
		response.sendRedirect("admin.jsp");
	}

}
