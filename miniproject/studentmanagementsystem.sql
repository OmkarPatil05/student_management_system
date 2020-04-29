create database studentmanagementsystem;
use studentmanagementsystem;
create table admin(username varchar(20),password varchar(20));
insert into admin values('admin','123');
select * from admin;
create table student(name varchar(100),rollNumber int(5),phoneno varchar(10),branch varchar(20),year varchar(5));
select * from student;