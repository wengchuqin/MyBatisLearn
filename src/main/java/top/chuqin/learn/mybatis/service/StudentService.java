package top.chuqin.learn.mybatis.service;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import top.chuqin.learn.mybatis.domain.Student;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by wengchuqin on 2017/12/21.
 */
public class StudentService {

    private static SqlSessionFactory sqlSessionFactory = null;

    static {
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    public List<Student> getAllStudent(){
        SqlSession session = sqlSessionFactory.openSession();
        List<Student> list = session.selectList("top.chuqin.learn.mybatis.mapper.StudentMapper.getAllStudent");
        session.commit();
        session.close();
        return list;
    }
}
