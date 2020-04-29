package com.sms;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sms.dao.Dao;


public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int rollNumber = Integer.parseInt( request.getParameter("rollNumber") ); 
		String field = request.getParameter("field");
		String value = request.getParameter("value");
		
		Dao dao = new Dao();
		dao.update(field, value, rollNumber);
		response.sendRedirect("admin.jsp");
	}

}
