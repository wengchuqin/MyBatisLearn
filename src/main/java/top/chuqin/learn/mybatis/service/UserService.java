package top.chuqin.learn.mybatis.service;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import top.chuqin.learn.mybatis.domain.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * Created by wengchuqin on 2017/12/21.
 */
public class UserService {

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

    public void save(User user){
        SqlSession session = sqlSessionFactory.openSession();
        session.insert("top.chuqin.learn.mybatis.mapper.UserMapper.save", user);
        session.commit();
        session.close();
    }

    public User getById(Integer id){
        SqlSession session = sqlSessionFactory.openSession();
        User user = session.selectOne("top.chuqin.learn.mybatis.mapper.UserMapper.selectUser", id);
        session.commit();
        session.close();
        return user;
    }

    public void updateUser(User newUser){
        SqlSession session = sqlSessionFactory.openSession();
        session.update("top.chuqin.learn.mybatis.mapper.UserMapper.updateUser", newUser);
        session.commit();
        session.close();
    }

    public void deleteUser(Integer id){
        SqlSession session = sqlSessionFactory.openSession();
        session.delete("top.chuqin.learn.mybatis.mapper.UserMapper.deleteUser", id);
        session.commit();
        session.close();
    }

    /**
     * 返回一个map其实不实用
     * @return
     */
    public List<Map<String, Object>> selectAllWithMap(){
        SqlSession session = sqlSessionFactory.openSession();
        List<Map<String, Object>> list = session.selectList("top.chuqin.learn.mybatis.mapper.UserMapper.selectAllWithMap");
        session.commit();
        session.close();
        return list;
    }

    /**
     * 使用ResultMap，把不规则的数据库Column和实体类的属性对应起来
     * @return
     */
    public List<User> selectAllWithResultMap(){
        SqlSession session = sqlSessionFactory.openSession();
        List<User> list = session.selectList("top.chuqin.learn.mybatis.mapper.UserMapper.selectAllWithResultMap");
        session.commit();
        session.close();
        return list;
    }


}
