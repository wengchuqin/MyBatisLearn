package top.chuqin.learn.mybatis.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.chuqin.learn.mybatis.domain.User;
import top.chuqin.learn.mybatis.mapper.UserMapper;
import top.chuqin.learn.mybatis.service.UserService;

import static org.junit.Assert.*;

/**
 * Created by wengchuqin on 2017/12/25.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class UserServiceImplTest {
    @Autowired
    private UserService userService;

    @Test
    public void testLogin() throws Exception {
        String loginname = "chuqin";
        String password = "123456";
        User user = userService.login(loginname, password);
        System.out.println(user);
    }
}