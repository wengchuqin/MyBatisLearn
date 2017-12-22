# MyBatisLearn MyBatis学习项目

## 一对一映射
Card，Person

## 一对多映射
Clazz，Student



## 分支需要的环境
### 数据库
#### 一对一查询
CREATE TABLE tb_card(
id INT PRIMARY KEY AUTO_INCREMENT,
code VARCHAR(18)
);
INSERT INTO tb_card(code) values('12345678');

CREATE TABLE tb_person(
id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(18),
sex VARCHAR(18),
age INT,
card_id INT UNIQUE,
FOREIGN KEY(card_id) REFERENCES tb_card(id)
);
INSERT INTO tb_person(name, sex, age, card_id) VALUES("jack", "男", 22, 1);

#### 一对多查询
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


