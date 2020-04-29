<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Admin</title>
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
      
      <div id="infobox">
      		<form action="CreateAdmin" method="post">
      				<input class="box" name="adminName" type="text" placeholder=" enter the username of admin"><br><br>
                    <input class="box" name="adminPassword" type="password" placeholder="enter the password"><br><br>
                    <button class="btn">Create</button><br><br>  
      		</form>			
                          
      </div>
</body>
</html>