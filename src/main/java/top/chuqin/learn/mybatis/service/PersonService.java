package top.chuqin.learn.mybatis.service;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import top.chuqin.learn.mybatis.domain.Person;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by wengchuqin on 2017/12/21.
 */
public class PersonService {

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



    public Person selectPeopleById(Integer id){
        SqlSession session = sqlSessionFactory.openSession();
        Person user = session.selectOne("top.chuqin.learn.mybatis.mapper.PersonMapper.selectPersonById", id);
        session.commit();
        session.close();
        return user;
    }

}