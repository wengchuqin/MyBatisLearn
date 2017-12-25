package top.chuqin.learn.mybatis.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import top.chuqin.learn.mybatis.domain.User;

/**
 * Created by wengchuqin on 2017/12/25.
 */
public interface UserMapper {

    @Insert("INSERT INTO tb_user(name, sex, age) VALUES(#{name}, #{sex}, #{age})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int saveUser(User user);

}
