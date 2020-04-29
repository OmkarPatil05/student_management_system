<%@page import="com.sms.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<!-- login session checking -->
		<%
			
			
			if(session.getAttribute("username") == null)
			{
				response.sendRedirect("home.jsp");
			}
		%>
 <div id = "Header">
                  <ol>
                      <li class = "headerInside" id="home">Student Management System</li> 
                        <li class = "headerInside" id="contact">Home</li>
                        <li class = "headerInside" id="support">Contact Us</li>
                  </ol>
      </div>
	<%
		Student student = (Student) session.getAttribute("student");
			
	%>
	<table id="tablebox">
            			<tr >
            				<th class="th">Name  </th>
            				<th class="th">Roll Number  </th>
            				<th class="th">Phone Number  </th>
            				<th class="th">Branch  </th>
            				<th class="th">Year  </th>
            			</tr>
            			<tr>
            				<td class="td"><%out.print(student.getName());%></td>
            				<td class="td"><%out.print(student.getRollNumber());%></td>
            				<td class="td"><%out.print(student.getPhoneNumber());%></td>
            				<td class="td"><%out.print(student.getBranch());%></td>
            				<td class="td"><%out.print(student.getYear());%></td>
            			</tr>
            		</table>
</body>
</html>