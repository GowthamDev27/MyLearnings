create database Practices;
use Practices;
create table products_details(
Product_name varchar(100) not null,
Product_ID varchar(20) primary key,
QTY int not null,
Price int not null
);
INSERT into products_details values
('Laptop Charger','PR002',1,1500),
('Adapter','PR010',1,750),
('Chager Cable B-type','PR019',1,450),
('Charger Cable C-type','PR008',1,600)
;
select*from products_details;
Alter table products_details add Customer_name varchar(100);
update products_details set Customer_name = 'Gowtham' where Product_ID='PR002';
update products_details set Customer_name = 'Maddy' where Product_ID in ('PR008','PR010');
insert into products_details values 
('Samsung s22','PR007',1,40000,'John'),
('iphone 14 pro','PR006',1,60000,'Kelly'),
('Realme 13 pro','PR005',1,40000,'Gwen'),
('Vivo V29','PR001',1,30000,'Peter Parker'),
('iphone 16','PR004',1,90000,'Ben')
;
update products_details
set Customer_name = 'Jordan'
where Product_ID = 'PR019';

Select sum(Price) as Price
from products_details where Customer_name='Maddy';

-- procedure 

DELIMITER $$
create procedure getProduct_Details(in Pro_ID varchar(200))

Begin
	select * from products_details
	where Pro_ID = product_ID;
end $$
Delimiter ;
drop procedure getProduct_Details;
call getProduct_Details('PR001');

-- create function

DELIMITER $$
CREATE FUNCTION CUSTOMERS( COST INT) RETURNS VARCHAR(100)
DETERMINISTIC
BEGIN
DECLARE CUST_NAMES VARCHAR(100);
SELECT Customer_name INTO CUST_NAMES FROM products_details
WHERE Price = COST;
RETURN CUST_NAMES;
END $$
DELIMITER ;

SELECT CUSTOMERS(60000);

-- Full data in 

DELIMITER $$
CREATE PROCEDURE FullTable()
Begin
select*from products_details;
end $$
DELIMITER ;
CALL FullTable();

-- function
DELIMITER $$
CREATE FUNCTION Addition(val1 int,val2 int) returns	int
DETERMINISTIC
BEGIN
DECLARE 
result int;
set result := val1+val2;
return result;
end $$
DELIMITER ;
SELECT Addition(30,40) as AdditionValue;

-- VIEW

Create view Pr_ID_Name as select Product_ID, Product_name from products_details where Price > 20000;
select * from Pr_ID_Name;

-- Triggers

DELIMITER $$
CREATE TRIGGER Product_count After INSERT ON products_details
for each row
BEGIN
DECLARE
Pro_count INT;
SELECT COUNT(Product_ID) as prd_count into Pro_count FROM products_details;
END $$
DELIMITER ;
drop trigger Product_count;

insert into products_details value('Redmi','PR003',1,15000,'Alok');
insert into products_details value('Moco','PR012',1,18000,'Adam');

-- ALTER table products_details add Product_type varchar(100);
-- UPDATE products_details
-- SET Product_type = 'Electronics'
-- WHERE P
select * from products_details;
Alter table products_details
drop column Product_type;

alter table products_details add
Warrenty_Till_date date;

update products_details
set Warrenty_Till_date = '2025-11-04'
where Product_ID = 'PR001';

update products_details
set Warrenty_Till_date = '2026-10-05'
where Product_ID = 'PR002';

update products_details
set Warrenty_Till_date = '2024-12-30'
where Product_ID = 'PR003';

update products_details
set Warrenty_Till_date = '2025-04-17'
where Product_ID = 'PR004';

update products_details
set Warrenty_Till_date = '2025-06-13'
where Product_ID = 'PR005';

update products_details
set Warrenty_Till_date = '2026-04-20'
where Product_ID = 'PR006';

update products_details
set Warrenty_Till_date = '2025-10-25'
where Product_ID = 'PR007';

update products_details
set Warrenty_Till_date = '2026-01-01'
where Product_ID = 'PR010';

update products_details
set Warrenty_Till_date = '2025-07-23'
where Product_ID = 'PR012';

update products_details
set Warrenty_Till_date = '2026-08-21'
where Product_ID = 'PR019';

select * from EMPLOYEES;
UPDATE EMPLOYEES
SET DATE_OF_JOIN ='2014-10-26'
WHERE EMP_ID = 'EM004';

-- TO FIND SENIOR MOST EMPLOYEE

create view emp_details as
select * FROM EMPLOYEES order by EXTRACT(YEAR FROM DATE_OF_JOIN) ASC LIMIT 1;

drop view emp_details;

SELECT * FROM emp_details;

-- Employees details in particular year using procedure

DELIMITER $$
CREATE PROCEDURE EMP_Details_pro(in emp_year date)
BEGIN
Declare 
EmpYear INT;
set EmpYear := year(emp_year);
SELECT * FROM EMPLOYEES where YEAR(DATE_OF_JOIN)=EmpYear;
END $$
DELIMITER ;
drop procedure EMP_Details_pro;
CALL EMP_Details_pro('2014-10-26');

DELIMITER $$
CREATE FUNCTION PRODUCT_PRICE_CATEGORY(PRO_ID VARCHAR(100), PRODUCT_PRICE INT)
RETURNS VARCHAR(100)
DETERMINISTIC
BEGIN
DECLARE 
PRICE_CATEGORY VARCHAR(100);
DECLARE
Pro_PRICE int;
SELECT Price into Pro_PRICE from products_details where Product_ID=PRO_ID;
IF PRODUCT_PRICE>Pro_PRICE
THEN SET
PRICE_CATEGORY = 'GOOD';

ELSE IF PRODUCT_PRICE = Pro_PRICE
THEN SET
PRICE_CATEGORY = 'AVERAGE';

ELSE SET
PRICE_CATEGORY ='BAD';
END IF;
END IF;

RETURN PRICE_CATEGORY;

END $$
DELIMITER ;
DROP FUNCTION PRODUCT_PRICE_CATEGORY;
SELECT PRODUCT_PRICE_CATEGORY('PR002',2000);

select * from products_details;

