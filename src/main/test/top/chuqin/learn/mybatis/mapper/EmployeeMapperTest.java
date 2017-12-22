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
public class EmployeeMapperTest {


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
    public void testSelectOrderById1() throws Exception {
        EmployeeMapper mapper =session.getMapper(EmployeeMapper.class);
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("id", 1);
        List<Employee> employeeList = mapper.selectEmployeeByIdLike(params);
        System.out.println(employeeList);
    }

    @Test
    public void testSelectOrderById2() throws Exception {
        EmployeeMapper mapper =session.getMapper(EmployeeMapper.class);
        Map<String, Object> params = new HashMap<String, Object>();
        List<Employee> employeeList = mapper.selectEmployeeByIdLike(params);
        System.out.println(employeeList);
    }

    @Test
    public void testUpdateEmployeeIfNecessary() throws Exception {
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

    @Test
    public void testSelectEmployeeIn() throws Exception {
        EmployeeMapper mapper =session.getMapper(EmployeeMapper.class);
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        List<Employee> employeeList = mapper.selectEmployeeIn(ids);
        System.out.println(employeeList);
    }

    @Test
    public void testSelectEmployeeIn2() throws Exception {
        EmployeeMapper mapper =session.getMapper(EmployeeMapper.class);
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("list", ids);
        List<Employee> employeeList = mapper.selectEmployeeIn(params);
        System.out.println(employeeList);
    }

    @Test
    public void testSelectEmployeeLikeLoginname() throws Exception {
        EmployeeMapper mapper =session.getMapper(EmployeeMapper.class);
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("loginname", "11");
        List<Employee> employeeList = mapper.selectEmployeeLikeLoginname(params);
        System.out.println(employeeList);
    }

}