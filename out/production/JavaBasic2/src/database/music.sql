use bookstore;
create table Music(
                    id int,
                    name varchar(50),
                    author varchar(50),
                    year int,
                    PRIMARY KEY (id)
);
insert into music values (1,'All I Ask','Adele',2021),
                         (2,'Shape of you','Edsheeran',2022),
                         (3,'Happier','Edsheeran',2021)
