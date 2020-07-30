# CreateEmployee
$ mysql -u root -p

Password: root

mysql> create database emp_database;

mysql> use emp_database;

mysql> create table employee (id integer not null auto_increment, age integer, dept varchar(255), gender varchar(255), joining_date date, name varchar(255), retiring_date date, primary key (id));


mysql> insert into employee (age, dept, gender, joining_date, name, retiring_date) values (20, 'IT', 'Male', '2019-01-22', 'Jackson', '2020-08-31');

mysql> insert into employee (age, dept, gender, joining_date, name, retiring_date) values (30, 'Sale', 'Female', '2018-09-01', 'Rose', '2020-12-31');

mysql> insert into employee (age, dept, gender, joining_date, name, retiring_date) values (25, 'HR', 'Male', '2016-01-10', 'Jin', '2020-07-31');

mysql> insert into employee (age, dept, gender, joining_date, name, retiring_date) values (35, 'IT', 'Male', '2010-02-01', 'Suga', '2020-02-28');

mysql> insert into employee (age, dept, gender, joining_date, name, retiring_date) values (22, 'IT', 'Female', '2017-03-25', 'Jisoo', '2019-05-20');

mysql> insert into employee (age, dept, gender, joining_date, name, retiring_date) values (23, 'Sale', 'Male', '2018-06-15', 'RM', '2020-06-30');

mysql> insert into employee (age, dept, gender, joining_date, name, retiring_date) values (32, 'HR', 'Female', '2012-07-18', 'Somi', '2020-07-31');

mysql> insert into employee (age, dept, gender, joining_date, name, retiring_date) values (40, 'IT', 'Female', '2010-09-11', 'Jennie', '2019-09-21');

mysql> insert into employee (age, dept, gender, joining_date, name, retiring_date) values (28, 'HR', 'Female', '2011-01-01', 'Lisa', '2015-08-31');

mysql> insert into employee (age, dept, gender, joining_date, name, retiring_date) values (26, 'IT', 'Male', '2013-11-21', 'V', '2019-10-23');

mysql> insert into employee (age, dept, gender, joining_date, name, retiring_date) values (38, 'Sale', 'Male', '2014-04-22', 'Jungkook', '2017-04-22');
