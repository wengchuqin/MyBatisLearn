package top.chuqin.learn.mybatis.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.chuqin.learn.mybatis.domain.User;

/**
 * Created by wengchuqin on 2017/12/25.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testFindWithLoginnameAndPassword(){
        String loginname = "chuqin";
        String password = "123456";
        User user = userMapper.findWithLoginnameAndPassword(loginname, password);
        System.out.println(user);
    }
}