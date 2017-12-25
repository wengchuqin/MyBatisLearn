package top.chuqin.learn.mybatis.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * CREATE TABLE tb_book (
	id INT (11) PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR (54),
	author VARCHAR (54),
	publicationdate DATE ,
	publication VARCHAR (150),
	price DOUBLE ,
	image VARCHAR (54),
	remark VARCHAR (600)
);
 * */
public class Book implements Serializable{
	
	private Integer id;				// id	
	private String name;			// 书名
	private Double price;			// 价格


	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Book{" +
				"price=" + price +
				", name='" + name + '\'' +
				", id=" + id +
				'}';
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}
