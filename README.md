# MyBatisLearn MyBatis学习项目

## basic分支需要的环境
### 数据库
（1）
create database mybatis;
use mybatis;
CREATE TABLE tb_user(
id INT(11)  PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(18) DEFAULT NULL,
sex CHAR(2) DEFAULT NULL,
age INT(11) DEFAULT NULL
);

（2）
CREATE TABLE tb_user2(
user_id INT(11)  PRIMARY KEY AUTO_INCREMENT,
user_name VARCHAR(18) DEFAULT NULL,
user_sex CHAR(2) DEFAULT NULL,
user_age INT(11) DEFAULT NULL
);

INSERT INTO tb_user2(user_name, user_sex, user_age) VALUES("jack", "男", 22);

（3）
CREATE TABLE tb_clazz(
id INT(11)  PRIMARY KEY AUTO_INCREMENT,
code VARCHAR(18)
);
INSERT INTO tb_clazz(code) VALUES("j1601");
INSERT INTO tb_clazz(code) VALUES("j1602");

CREATE TABLE tb_student(
id INT(11)  PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(18),
sex CHAR(3),
age INT,
clazz_id INT,
FOREIGN KEY (clazz_id) REFERENCES tb_clazz(id)
);
INSERT INTO tb_student(name , sex , age ,clazz_id ) VALUES("jack", "男", 22, 1);
INSERT INTO tb_student(name , sex , age ,clazz_id ) VALUES("jack", "男", 23, 1);
INSERT INTO tb_student(name , sex , age ,clazz_id ) VALUES("jack", "男", 24, 2);
INSERT INTO tb_student(name , sex , age ,clazz_id ) VALUES("jack", "男", 25, 2);



