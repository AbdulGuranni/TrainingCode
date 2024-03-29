SELECT TABLE_NAME, COLUMN_NAME,
	   CONSTRAINT_NAME, 
       REFERENCED_TABLE_NAME,
       REFERENCED_COLUMN_NAME
       FROM INFORMATION_SCHEMA.KEY_COLUMN_USAGE
       WHERE REFERENCED_TABLE_NAME ='CAB';
       
ALTER TABLE employee drop column cab_id;
select * from employee;

create table cab_emp (cab_id int, emp_id int);
insert into cab_emp values
		(1556,501), (1556,502), (2002,503), (2002,504);

SELECT e.emp_name, e.department,
	   c.cab_numner, c.pickup, c.drop_loc, c.cab_type
       from cab_emp ce
       inner join cab c on ce.cab_id = c.cab_numner
       inner join employee e on ce.emp_id = e.emp_id;
       
ALTER TABLE employee drop constraint employee_ibfk_1;

show create table book;

desc myemployee;

insert into myemployee values(
        'A101','Jo','Director','operations',null);

insert into myemployee values(
        'B001','Kevin','Project Manager','Tech','A101');
        
insert into myemployee values(
        'B002','Raju','Project Manager','Tech','A101');
        
insert into myemployee values(
        'T01','Rohan','TeamLeader','Tech','B001'),
        ('T02','Ben','TeamLeader','Tech','B001'),
        ('T03','John','TeamLeader','Mktg','B002'),
        ('T04','Shiv','TeamLeader','Mktg','B002');
        
insert into myemployee values(
        'D01','Rajesh','Developer','Tech','T01'),
        ('D02','Ram','Developer','Tech','T01'),
        ('D03','Roni','Developer','Tech','T01'),
        ('D04','Jagadish','Developer','Mktg','T03'),
        ('D05','Jagan','Developer','Mktg','T03'),
        ('D06','Joseph','Developer','Mktg','T03');
        
select * from myemployee;

select e.emp_name as EMPLOYEE_NAME,
       e.designation as EMP_DESIGNATION,
       s.emp_name as SUPERVISOR_NAME,
       s.designation as SUPERVISOR_DESIGNATION,
       e.department as DEPARTMENT
       from myemployee e, myemployee s where e.supervisor_id = s.emp_id;
       
       -- procedure_starts
use DELIMITER $$
create procedure show_books(in auth varchar(20))
BEGIN
 SELECT * FROM BOOK WHERE AUTHOR = AUTH;
END
$$

CALL SHOW_BOOKS('Kathy',2000) $$
select text from information_schema where AUTHOR ='Kathy' and price<200; $$
        
        
