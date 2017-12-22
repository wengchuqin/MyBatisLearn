# MyBatisLearn MyBatis学习项目

## 动态sql
### 数据库
CREATE TABLE tb_employee(
id INT(11) PRIMARY KEY AUTO_INCREMENT,
loginname VARCHAR(18),
password VARCHAR(18),
name VARCHAR(18) DEFAULT NULL,
sex CHAR(2) DEFAULT NULL,
age INT(11) DEFAULT NULL,
phone VARCHAR(21),
sal DOUBLE,
state VARCHAR(18)
);
INSERT INTO tb_employee(id, loginname, password, name, sex, age, phone, sal, state) VALUES(1, "1", "123456", "chuqin", "男", 22, "18813299904", 123.55, 'ACTIVE');
INSERT INTO tb_employee(id, loginname, password, name, sex, age, phone, sal, state) VALUES(2, "111", "123456", "出勤", "男", 22, "18813299904", 123.55, 'ACTIVE');
INSERT INTO tb_employee(id, loginname, password, name, sex, age, phone, sal, state) VALUES(3, "1111", "123456", "fang", "女", 22, "18813299904", 123.55, 'ACTIVE');