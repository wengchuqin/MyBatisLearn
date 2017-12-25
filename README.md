# MyBatisLearn MyBatis学习项目

## MyBatis + Spring 整合项目分支需要的环境
### 数据库
<code>
create database book;
use book;

CREATE TABLE tb_user(
id INT(11)  PRIMARY KEY AUTO_INCREMENT,
username VARCHAR(18) DEFAULT NULL,
loginname VARCHAR(50) UNIQUE,
password VARCHAR(18)
);
INSERT INTO tb_user(id, username , loginname , password ) VALUES(1, "楚钦", "chuqin", "123456");

CREATE TABLE tb_book(
id INT(11)  PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(54),
price DOUBLE
);
INSERT INTO tb_book(id, name, price ) VALUES(1, "java",111);
INSERT INTO tb_book(id, name, price ) VALUES(2, "C++",123);
</code>



