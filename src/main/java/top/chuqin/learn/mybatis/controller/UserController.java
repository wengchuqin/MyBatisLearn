package top.chuqin.learn.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import top.chuqin.learn.mybatis.domain.User;
import top.chuqin.learn.mybatis.service.UserService;

import javax.servlet.http.HttpSession;

/**
 * Created by wengchuqin on 2017/12/25.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("login.action")
    public ModelAndView login(String loginname, String password,
                              ModelAndView mv,
                              HttpSession session){

        User user = userService.login(loginname, password);
        if(user != null){
            //登录成功，跳转页面
            session.setAttribute("user", user);
            mv.setView(new RedirectView("allBooks.action"));
        }else {
            //登陆失败，设置提示信息，跳转登陆页面
            mv.addObject("message", "登录名或密码错误，请重新输入");
            mv.setViewName("loginForm");
        }

        return mv;
    }

}
