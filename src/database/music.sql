use bookstore;
create table Music(
                    id int,
                    name varchar(50),
                    author varchar(50),
                    year int,
                    PRIMARY KEY (id)
);
insert into music values (7,'All I Ask','Adele',2021),
                         (8,'Shape of you','Edsheeran',2022),
                         (9,'Happier','Edsheeran',2021)
