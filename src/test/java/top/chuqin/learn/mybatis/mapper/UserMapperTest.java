package top.chuqin.learn.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import top.chuqin.learn.mybatis.domain.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by wengchuqin on 2017/12/25.
 */
public class UserMapperTest {
    private static SqlSessionFactory sqlSessionFactory = null;
    SqlSession session = null;
    UserMapper mapper = null;

    @BeforeClass
    public static void initSqlSessionFactory() throws IOException {
        InputStream inputStream = null;
        inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Before
    public void beforeSession(){
        session = sqlSessionFactory.openSession();
        mapper = session.getMapper(UserMapper.class);
    }

    @After
    public void afterSession(){
        session.commit();
        session.close();
    }

    @Test
    public void testSaveUser() throws Exception {
        User user = new User("chuqinss", "男", 123);
        mapper.saveUser(user);
    }

    @Test
    public void testRemoveUser() throws Exception {
        mapper.removeUser(4);
    }

    @Test
    public void testModifyUser() throws Exception {
        User user = new User("chuqinafang", "男", 123);
        user.setId(5);
        mapper.modifyUser(user);
    }

    @Test
    public void testSelectUserById() throws Exception {
        User user = mapper.selectUserById(5);
        System.out.println(user);
    }

    @Test
    public void testSelectAllUser() throws Exception {
        List<User> users = mapper.selectAllUser();
        System.out.println(users);
    }
}
