CREATE DATABASE IF NOT EXISTS ebookshop;

use ebookshop;

DROP TABLE IF EXISTS books;
create table books(
                      id int,
                      title varchar(50),
                      author varchar(50),
                      price float,
                      qty int,
                      PRIMARY KEY (id));
INSERT INTO books VALUES (1, "One more time", "NgKhanh", 50, 20);
INSERT INTO books VALUES(2, "Onepiece1", "Oda", 20,10);
INSERT INTO books VALUES(3, "Onepiece2", "Oda", 30,20);
INSERT INTO books VALUES(4, "Onepiece3", "Oda", 40,15);

SELECT * FROM books;
SELECT title, price FROM books WHERE author = "Oda";
SELECT title, author, price, qty from books WHERE author = "Oda" or price >=30 order by price desc, id ASC;