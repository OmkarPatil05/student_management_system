package com.sms.model;

public class Student 
{
  private String name;
  private int rollNumber;
  private long phoneNumber;
  private String branch;
  private String year;
public String getName() {
	return name;
}
public void setName(String name)
{
	this.name = name;
}

public int getRollNumber() 
{
	return rollNumber;
}

public void setRollNumber(int rollNumber)
{
	this.rollNumber = rollNumber;
}

public long getPhoneNumber()
{
	return phoneNumber;
}

public void setPhoneNumber(long phoneNumber) 
{
	this.phoneNumber = phoneNumber;
}

public String getBranch() 
{
	return branch;
}

public void setBranch(String branch)
{
	this.branch = branch;
}

public String getYear() 
{
	return year;
}

public void setYear(String year) 
{
	this.year = year;
}

}
