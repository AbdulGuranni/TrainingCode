Create table product( product_id int primary key auto_increment,
					  product_name varchar(20),
                      brand varchar(20),
                      price float,
                      category varchar(20));
insert into product (product_name, brand, price, category) values ('Mobile','Sony',20000,'Home Appliances');

update product set product_name = 'Dishwasher' where price = 80000;
select * from product;
create table orders ( order_id integer primary key auto_increment,
					  customer_name varchar(20),
                      billing_date date,
                      quantity integer,
                      prod_id integer,
                      foreign key(prod_id) references product(product_id));
                      
desc orders;
insert into orders (customer_name, billing_date, quantity,prod_id) values ('Gokul', '2024-01-11',1,2);
select * from orders;
select o.order_id, o.customer_name,
	   p.product_name,p.brand,o.billing_date,
       o.quantity from orders o right join product p on
       o.prod_id = p.product_id;