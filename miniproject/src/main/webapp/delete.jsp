<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>Delete</title>
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
                <form action="Delete" method="post">
                <div id="infobox">
                        <input class="box" name="username" type="text" placeholder=" enter the name of student"><br><br>
                        <input class="box" name="rollNumber" type="text" placeholder="enter the roll no"><br><br>
                         <button class="btn">Delete</button><br><br>    
                </div>
                </form> 
</body>
</html>