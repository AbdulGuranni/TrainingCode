create table book(title varchar(20), 
	book_id integer primary key auto_increment,
	author varchar(20),
    price float);
desc book;
insert into book (title,author,price) values ('Angular','Spint', 1600);
select * from book; 
select min(price) from book;
select max(price) from book;
select avg(price) from book;
select count(*) from book;
select upper(emp_name) as empNAME, lower(CITY) as city from employee;
select sum(price) from book;
insert into book(title,author,price) values(upper('Java in Actuon'),trim('Kathy'),450.7899);
select lower(title), format(price,1), upper(author) from book;
select * from book;
select substr(title,1,5) from book;
select lower(title) as title, char_length(title) as length from book;
update student set state = 'Karnataka';
select concat(stud_name," ",department," ",course) as stud_deatils, concat(state," ",city) as address from student;