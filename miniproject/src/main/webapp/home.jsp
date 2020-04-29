
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>Home</title>
 <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	

	  <div id = "Header">
                  <ol>
                      <li class = "headerInside" id="home">Student Management System</li> 
                        <li class = "headerInside" id="contact">Home</li>
                        <li class = "headerInside" id="support">Contact Us</li>
                  </ol>
      </div>
              
              <div id="loginbox">
              			<form action="Login">
              				<input class="box" type="text" name="username" placeholder="Username"   ><br><br>
                        	<input class="box" type="password" name="password" placeholder="password" ><br><br>
                        	<button type="submit" class="btn">Login</button><br><br>
              			</form>
                           <a style="text-decoration:none; color:brown;font-weight:400;"  href="createAdmin.jsp">create admin account</a> 
              </div>
              
</body>
</html>