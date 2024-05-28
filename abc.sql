create database abc;
use abc;
CREATE TABLE Persons (
	PersonId int not null primary key auto_increment,
	FirstName varchar(255),
	LastName varchar(255),
	Address varchar(255),
	City varchar(255)
);

insert into persons values (1,'nguyen','tan','30 cmt8','dana');
insert into persons (FirstName,LastName,Address,City) values ('le','loi','cmt8','dana');
insert into persons (FirstName,LastName,Address,City) values ('nguyen','phuc','cmt8','dana');

delete from persons where PersonId = 1;
select * from persons;
select FirstName from persons where PersonId = 2;
select * from persons where personid = 2;
drop table persons;