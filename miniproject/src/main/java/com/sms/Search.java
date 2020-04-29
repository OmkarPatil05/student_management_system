package com.sms;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sms.dao.Dao;
import com.sms.model.Student;


public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name = request.getParameter("name");
		int rollNumber = Integer.parseInt(request.getParameter("rollNumber"));
		
		Dao dao = new Dao();
		Student student = dao.search(name, rollNumber);
		HttpSession session = request.getSession();
		session.setAttribute("student",student);
		
		response.sendRedirect("display.jsp");
	}

}
