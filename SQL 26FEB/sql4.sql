use voyadb;
INSERT INTO `voyadb`.`stud_book`
(`STUD_ID`,
`BOOK_ID`)
VALUES
(1,101),
(2,102),
(3,103),
(3,104),
(2,105);

select * from stud_book;

select s.studt_name, s.email from student s
	   inner join stud_book sb on s.student_id = sb.stud_id
       inner join book b on sb.book_id = b.book_id;
       
select s.studt_name, s.email,b.title,b.author from stud_book sb
	   left join student s on s.student_id = sb.stud_id
       left join book b on sb.book_id = b.book_id;
       

       
select * from student;
delete from stud_book where stud_id =1;
