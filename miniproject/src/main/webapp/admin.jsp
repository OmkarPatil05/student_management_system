<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admin</title>
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
                
                <div id="infobox">
                      
                         <a  href="create.jsp"><button name="create" class="bifbtn">Create</button></a>
                         <a href="update.jsp"><button class="bifbtn">Update</button></a>
                         <a href="delete.jsp"><button class="bifbtn">Delete</button></a>
                         <a href="search.jsp"><button name="search" class="bifbtn">Search</button></a>       
                </div> 
</body>
</html>