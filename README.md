# MyBatisLearn MyBatis学习项目

## 复杂查询
### 数据库
CREATE TABLE tb_consumer(
id INT PRIMARY KEY AUTO_INCREMENT,
username VARCHAR(18)
);
INSERT INTO tb_consumer(id, username) VALUES(1, "chuqin");
INSERT INTO tb_consumer(id, username) VALUES(2, "afang");


CREATE TABLE tb_article(
id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(18),
price DOUBLE
);
INSERT INTO tb_article(id, name, price) VALUES(1, "饼干1", 111);
INSERT INTO tb_article(id, name, price) VALUES(2, "饼干1", 222);
INSERT INTO tb_article(id, name, price) VALUES(3, "饼干3", 333);


CREATE TABLE tb_order(
id INT PRIMARY KEY AUTO_INCREMENT,
total DOUBLE,
consumer_id INT,
FOREIGN KEY(consumer_id) REFERENCES tb_consumer(id)
);
INSERT INTO tb_order(id, total , consumer_id ) VALUES(1, 111, 1);
INSERT INTO tb_order(id, total , consumer_id ) VALUES(2, 2223, 1);


CREATE TABLE tb_item(
order_id INT,
article_id INT,
amount INT,
PRIMARY KEY (order_id, article_id),
FOREIGN KEY(order_id) REFERENCES tb_order(id),
FOREIGN KEY(article_id) REFERENCES tb_article(id)
);
INSERT INTO tb_item(order_id , article_id , amount ) VALUES(1, 1, 1);
INSERT INTO tb_item(order_id , article_id , amount ) VALUES(1, 2, 1);
INSERT INTO tb_item(order_id , article_id , amount ) VALUES(1, 3, 2);
INSERT INTO tb_item(order_id , article_id , amount ) VALUES(2, 2, 2);
INSERT INTO tb_item(order_id , article_id , amount ) VALUES(2, 3, 2);




