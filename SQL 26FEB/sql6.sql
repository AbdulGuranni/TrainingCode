use delimiter $$
call bookCountByPrice(1000,@total)$$
select @total$$

use delimiter $$
call get_cabs_by_type('dezire car')$$

select * from book where title like '%java%';
explain select * from book where title like '%java%';
update book set title = 'java' where book_id = 103;

create index tit_index on book(title);
drop index tit_index on book;
select * from book where book_id=101;
explain select * from book where book_id=101;

explain select * from book where ISBN_no = 454545;






create index title on book(title);
explain select * from book where title like '%java';
