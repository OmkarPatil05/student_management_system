package com.sms.dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.sms.cipher.Caeser;
import com.sms.model.Admin;
import com.sms.model.Student;

public class Dao 
{
	java.sql.Connection connection;
	PreparedStatement prestatement;
	Statement statement;
      public Dao()
      {    try
      		{
    	  		Class.forName("com.mysql.cj.jdbc.Driver");
    	  		 connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagementsystem","root","root");
    	  		
    	  		
      		}
      		catch(Exception e)
      		{
      			System.out.println(e);
      		}
    	  
      }
      
      public Boolean createAdmin(String adminName,String adminPassword)
      {
    	  Boolean status = false;
    	  try
    	  {
    		  prestatement = connection.prepareStatement("insert into admin(username,password) values(?,?);");
    		  prestatement.setString(1,adminName);
    		  prestatement.setString(2,adminPassword);
    		  status = prestatement.execute();
    	  } 
    	  catch (Exception e)
    	  {
			System.out.println("error in admin create.");
    	  }
    	  
    	  return status;
      }
      
      public Admin getAdmin(String username) 
      {   
    	  Admin admin = new Admin();
    	  Caeser caeser = new Caeser();
    	  username = caeser.encrypt(username);
    	  try
    	  {
    		  statement =  connection.createStatement();
    	  
    	 ResultSet set =  statement.executeQuery("select * from admin where username='"+username+"';");
    	  
    	 	set.next();
    	 	
    	  admin.setUsername(caeser.dencrypt(set.getString("username")));
    	  admin.setPassword(caeser.dencrypt(set.getString("password")));
    	  }
    	  catch(Exception e)
    	  {
    		  System.err.print(e+" Exception in getAdmin");
    	  }
    	  return admin;
      }
      
      public Student getStudent(String name,Long phoneno,Integer rollNumber,String branch,String year) 
      {  
    	  Student student = new Student();
    	  Caeser caeser = new Caeser();
    	  try
    	  {
    		  
    		  
    	  prestatement =  connection.prepareStatement("insert into student(name,rollNumber,phoneno,branch,year) values(?,?,?,?,?);");
    	  
    	  prestatement.setString(1,caeser.encrypt(name));
    	  prestatement.setInt(2,Integer.parseInt(caeser.encrypt(rollNumber.toString())));
    	  prestatement.setLong(3,Long.parseLong(caeser.encrypt(phoneno.toString())));
    	  prestatement.setString(4,caeser.encrypt(branch));
    	  prestatement.setString(5, caeser.encrypt(year));
    	 
    	  prestatement.execute();
    	
    	  }
    	  catch(Exception e)
    	  {
    		  System.err.print(e+" Exception in getStudent");
    	  }
    	  return student;
      }
      
      public boolean update(String field,String value,Integer rollNumber)
      {
    	  boolean flag = false;
    	  Caeser caeser = new Caeser();
    	  value = caeser.encrypt(value);
    	  rollNumber = Integer.parseInt( caeser.encrypt(rollNumber.toString()) );
    	  try
    	  {
    	  prestatement =  connection.prepareStatement("update student set "+field+"='"+value+"' where rollNumber="+rollNumber);
    	  
    	 
    	 
    	  flag =  prestatement.execute();
    	
    	  }
    	  catch(Exception e)
    	  {
    		  System.err.print(e+"Exception in update");
    	  }
    	  return flag;
    	  
      }
      
      public boolean delete(String name,Integer rollNumber)
      {
    	  boolean flag = false;
    	  Caeser caeser = new Caeser();
    	  name = caeser.encrypt(name);
    	  rollNumber = Integer.parseInt( caeser.encrypt(rollNumber.toString()) );
    	  try
    	  {
    	  prestatement =  connection.prepareStatement("delete from student where rollNumber="+rollNumber+" and name='"+name+"';");
    	  
    	  flag =  prestatement.execute();
    	
    	  }
    	  catch(Exception e)
    	  {
    		  System.err.print(e+"Exception in delete");
    	  }
    	  return flag;
    	  
      }
      
      
      public Student search(String name,Integer rollNumber) 
      {
    	  
    	  Student student = new Student();
    	  Caeser caeser = new Caeser();
    	  rollNumber = Integer.parseInt(caeser.encrypt(rollNumber.toString()));
    	  try
    	  {
    	  statement = (Statement) connection.createStatement();
    	  
    	 ResultSet set =  statement.executeQuery("select * from student where  rollNumber="+rollNumber+";");
    	  
    	 set.next();
    	
    	  student.setName(caeser.dencrypt(set.getString("name")));
    	  Integer rollNo =  set.getInt("rollNumber");
    	  rollNo = Integer.parseInt(caeser.dencrypt(rollNo.toString()));
    	  student.setRollNumber(rollNo);
    	  Long phoneno =  set.getLong("phoneno");
    	  phoneno = Long.parseLong(caeser.dencrypt(rollNo.toString()));
    	  student.setPhoneNumber(phoneno);
    	  student.setBranch(caeser.dencrypt(set.getString("branch")));
    	  student.setYear(caeser.dencrypt(set.getString("year")));
    	  }
    	  catch(Exception e)
    	  {
    		  System.out.print(e);
    	  }
    	  return student;
      }
      
}
