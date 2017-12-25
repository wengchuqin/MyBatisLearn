package top.chuqin.learn.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import top.chuqin.learn.mybatis.domain.Book;
import top.chuqin.learn.mybatis.domain.User;
import top.chuqin.learn.mybatis.service.BookService;
import top.chuqin.learn.mybatis.service.UserService;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by wengchuqin on 2017/12/25.
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("allBooks.action")
    public ModelAndView allBooks(){

        ModelAndView mv = new ModelAndView();
        List<Book> books = bookService.getAll();
        mv.addObject("books", books);
        mv.setViewName("allBooksPage");

        return mv;
    }

}
