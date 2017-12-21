# MyBatisLearn MyBatis学习项目



## 分支需要的环境
### 数据库
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



