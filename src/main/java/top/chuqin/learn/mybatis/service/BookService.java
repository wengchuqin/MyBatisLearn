package top.chuqin.learn.mybatis.service;

import top.chuqin.learn.mybatis.domain.Book;

import java.util.List;


/**
 * Book服务层接口
 * */
public interface BookService {
	
	/**
	 * 查找所有图书
	 * @return Book对象集合
	 * */
	List<Book> getAll();

}
