package top.chuqin.learn.mybatis.mapper;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import top.chuqin.learn.mybatis.domain.Employee;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wengchuqin on 2017/12/22.
 */
public class SqlSessionCacheTest {


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


    /**
     * MyBatis有一级缓存
     * 一共发出1次查询语句
     * @throws Exception
     */
    @Test
    public void queryOnce() throws Exception {
        //数据库原始数据
        EmployeeMapper mapper =session.getMapper(EmployeeMapper.class);
        Employee employee = mapper.selectEmployeeById(1);
        System.out.println(employee);

        //再次查询
        employee = mapper.selectEmployeeById(1);
        System.out.println(employee);
    }

    /**
     * DML语句会清空一级缓存。
     * 一共发出两次查询语句
     * @throws Exception
     */
    @Test
    public void queryTwice() throws Exception {
        //数据库原始数据
        EmployeeMapper mapper =session.getMapper(EmployeeMapper.class);
        Employee employee = mapper.selectEmployeeById(1);
        System.out.println(employee);

        //修改并更新
        employee.setAge(null);
        employee.setSal(employee.getSal() * 2);
        mapper.updateEmployeeIfNecessary(employee);

        //再次查询
        employee = mapper.selectEmployeeById(1);
        System.out.println(employee);
    }




}