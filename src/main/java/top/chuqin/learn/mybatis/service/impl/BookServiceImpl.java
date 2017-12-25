package top.chuqin.learn.mybatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import top.chuqin.learn.mybatis.domain.Book;
import top.chuqin.learn.mybatis.mapper.BookMapper;
import top.chuqin.learn.mybatis.service.BookService;

/**
 * Book服务层接口实现类
 * @Service("bookService")用于将当前类注释为一个Spring的bean，名为bookService
 * */
@Transactional
@Service
public class BookServiceImpl implements BookService {
	
	/**
	 * 自动注入BookMapper
	 * */
	@Autowired
	private BookMapper bookMapper;

	/**
	 * BookService接口getAll方法实现
	 * @see { BookService }
	 * */
	@Transactional(readOnly=true)
	@Override
	public List<Book> getAll() {
		
		return bookMapper.findAll();
	}

}
