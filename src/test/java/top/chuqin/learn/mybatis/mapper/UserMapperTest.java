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

import static org.junit.Assert.*;

/**
 * Created by wengchuqin on 2017/12/25.
 */
public class UserMapperTest {
    private static SqlSessionFactory sqlSessionFactory = null;
    SqlSession session = null;

    @BeforeClass
    public static void initSqlSessionFactory() throws IOException {
        InputStream inputStream = null;
        inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Before
    public void initSqlSession(){
        session = sqlSessionFactory.openSession();
    }

    @After
    public void afterSession(){
        session.commit();
        session.close();
    }

    @Test
    public void testSaveUser() throws Exception {
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = new User("chuqinss", "男", 123);
        mapper.saveUser(user);
    }
}