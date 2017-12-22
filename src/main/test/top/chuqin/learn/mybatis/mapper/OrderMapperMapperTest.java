package top.chuqin.learn.mybatis.mapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import top.chuqin.learn.mybatis.domain.Order;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.*;

/**
 * Created by wengchuqin on 2017/12/22.
 */
public class OrderMapperMapperTest {


    static SqlSessionFactory sqlSessionFactory = null;
    SqlSession session = null;

    @BeforeClass
    public static void initSqlSessionFactory(){
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Before
    public void initSession(){
        session = sqlSessionFactory.openSession();
    }

    @After
    public void closeSession(){
        session.commit();
        session.close();
    }

    @Test
    public void testSelectOrderById() throws Exception {
        OrderMapper mapper =session.getMapper(OrderMapper.class);
        Order order = mapper.selectOrderById(1);
        System.out.println(order);
    }
}