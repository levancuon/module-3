SELECT * FROM student.users;
use student;
create table users;
create table Class(
id int not null primary key auto_increment,
name varchar(255)
);
create table Teacher(
id int not null primary key	auto_increment,
name varchar(255),
age int,
country varchar(255)
);
create database tueday21;