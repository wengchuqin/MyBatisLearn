package top.chuqin.learn.mybatis.service;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Assert;
import org.junit.Test;
import top.chuqin.learn.mybatis.domain.User;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by wengchuqin on 2017/12/21.
 */
public class UserServiceTest {
    UserService userService = new UserService();

    @Test
    public void saveTest() throws IOException {
        User user = new User("admin", "男", 22);
        userService.save(user);
    }

    @Test
    public void getByIdTest(){
        User user = userService.getById(4);
        System.out.println(user);
    }

    @Test
    public void updateUserTest(){
        User user = userService.getById(4);
        System.out.println("before update, " + user);

        user.setAge(user.getAge() + 1);
        userService.updateUser(user);

        user = userService.getById(4);
        System.out.println("after update, " + user);
    }

    @Test
    public void deleteUserTest(){
        User user = new User("admin", "男", 22);
        userService.save(user);

        //已经插入数据库了
        User userInDatabase = userService.getById(user.getId());
        Assert.assertNotNull(userInDatabase);

        userService.deleteUser(user.getId());

        //已经删除了
        Assert.assertNull(userService.getById(user.getId()));
    }

    @Test
    public void selectAllWithMapTest(){
        List<Map<String, Object>> list = userService.selectAllWithMap();
        for(Map<String, Object> map : list){
            System.out.println(map);
        }
    }

    @Test
    public void selectAllWithResultMapTest(){
        List<User> list = userService.selectAllWithResultMap();
        for(User user : list){
            System.out.println(user);
        }
    }


}
