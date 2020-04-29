<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>create</title>
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
              <form action="Login" method="post">
              <div id="infobox">
                        <input class="box" type="text" name="username" placeholder="enter name of student"   ><br><br>
                        <input class="box" type="text" name="rollNumber" placeholder="enter roll no."   ><br><br>
                        <input class="box" type="text" name="phoneno" placeholder="enter phone number" ><br><br>
                        
                        <select class="box" name="branch">
                               <option>branch</option>
                             <option value="computer 1">computer 1</option>
                             <option value="computer 2">computer 2</option>
                             <option value="computer 2nd shift">computer 2nd shift</option>
                             <option value="ENTC 1">ENTC 1</option>
                             <option value="ENTC 2">ENTC 2</option>
                             <option value="mech 1">mech 1</option>
                              <option value="mech 2">mech 2</option>
                        </select><br><br>
                        
                        <select class="box" name="year">
                             <option >year</option>
                             <option value="1st">1st</option>
                             <option value="2nd">2nd</option>
                             <option value="3rd">3d</option>
                             <option value="4th">4th</option>
                             
                        </select><br><br>
                        
                        <button class="btn">Create</button><br><br>          
              </div>
              </form>
</body>
</html>