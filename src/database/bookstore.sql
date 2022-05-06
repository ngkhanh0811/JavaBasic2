create database bookstore;

use bookstore;

create table Book (
                      bookID int,
                      title varchar(50),
                      price int,
                      author varchar(50),
                      qty int,
                      category varchar(50) references Category(category),
                      status int,
                      primary key (bookID)
);

create table Category(
                         catID int,
                         category varchar(50),
                         primary key (category)
);

create table Orders(
                       orderID int,
                       cusName varchar(50),
                       cusID int references Customer(cusID),
                       dateOrder date,
                       primary key (orderID)
);

create table Customer(
                         cusID int,
                         cusName varchar(50),
                         address varchar(50),
                         phone varchar(50),
                         primary key (cusID)
);

insert into Customer values(102,'Kien','Bac Giang', 091248124);
insert into Customer values(103,'Quang Anh','Ninh Binh', 091274124);
insert into Customer values(104, 'Hoang Luong','Quang Ninh', 031247122);
insert into Customer values(105, 'Vu Quy', 'Thai Binh', 09172412146);
insert into Customer values(106, 'Nguyen Khanh', 'Ha Noi', 098729543);
insert into Customer values(107,'Ta Van Minh', 'Thanh Hoa', 0367286942);

insert into Orders values(1, 'Nguyen Khanh', 106, '01/02/2022');
insert into Orders values(2, 'Kien', 102,'02/03/2022');
insert into Orders values(3, 'Quang Anh', 103, '02/04/2022');
insert into Orders values(4, 'Vu Quy', 105, '01/01/2022');
insert into Orders values(5, 'Hoang Luong', 104, '12/12/2021');

insert into Category values(206, 'comics');
insert into Category values(205, 'sign');
insert into Category values(204, 'manga');
insert into Category values(203, 'novel');
insert into Category values(202, 'literary');

insert into Book values(625, 'Onepiece', 10, 'Oda', 102, 'manga', 1);
insert into Book values(620, 'Doraemon', 12, 'Fujiko', 200, 'manga', 1);
insert into Book values(621, 'De men phieu luu ki', 20, 'To Hoai', 199, 'literary', 1);
insert into Book values(622, 'Sherlock Holmes', 40, 'Conan Doyles', 112, 'novel', 1);
insert into Book values(623, 'Dragon Ball', 12, 'Oda', 122, 'comics', 1);
insert into Book values(624, 'Nguyen Khanh tu truyen', 50, 'Nguyen Ba Khanh', 0, 'sign', 0);

select * from Book;
select * from Category;
select * from Orders;
select * from Customer;