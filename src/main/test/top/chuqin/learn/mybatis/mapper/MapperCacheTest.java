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

/**
 * Created by wengchuqin on 2017/12/22.
 */
public class MapperCacheTest {


    static SqlSessionFactory sqlSessionFactory = null;

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


    /**
     * MyBatis有二级缓存
     * 一共发出1次查询语句
     *
     * @throws Exception
     */
    @Test
    public void queryOnce() throws Exception {
        SqlSession session = null;

        //数据库原始数据
        session = sqlSessionFactory.openSession();
        EmployeeMapper mapper =session.getMapper(EmployeeMapper.class);
        Employee employee = mapper.selectEmployeeById(1);
        System.out.println(employee);
        session.commit();
        session.close();

        //再次查询
        session = sqlSessionFactory.openSession();
        mapper =session.getMapper(EmployeeMapper.class);
        employee = mapper.selectEmployeeById(1);
        System.out.println(employee);
        session.commit();
        session.close();
    }

    /**
     * DML语句会清空一级缓存。
     * 但是不会清空二级缓存
     * 一共发出两次查询语句
     * @throws Exception
     */
    @Test
    public void queryTwice() throws Exception {
        SqlSession session = null;

        //数据库原始数据
        session = sqlSessionFactory.openSession();
        EmployeeMapper mapper =session.getMapper(EmployeeMapper.class);
        Employee employee = mapper.selectEmployeeById(1);
        System.out.println(employee);

        //修改并更新
        session = sqlSessionFactory.openSession();
        mapper =session.getMapper(EmployeeMapper.class);
        employee.setAge(null);
        employee.setSal(employee.getSal() * 2);
        mapper.updateEmployeeIfNecessary(employee);

        //再次查询
        session = sqlSessionFactory.openSession();
        mapper =session.getMapper(EmployeeMapper.class);
        employee = mapper.selectEmployeeById(1);
        System.out.println(employee);
    }




}