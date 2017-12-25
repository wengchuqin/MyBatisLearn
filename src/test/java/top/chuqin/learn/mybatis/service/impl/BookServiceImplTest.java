package top.chuqin.learn.mybatis.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.chuqin.learn.mybatis.domain.Book;
import top.chuqin.learn.mybatis.domain.User;
import top.chuqin.learn.mybatis.service.BookService;
import top.chuqin.learn.mybatis.service.UserService;

import java.util.List;

/**
 * Created by wengchuqin on 2017/12/25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class BookServiceImplTest {
    @Autowired
    private BookService bookService;

    @Test
    public void testGetAll() throws Exception {
        List<Book> books = bookService.getAll();
        System.out.println(books);
    }
}