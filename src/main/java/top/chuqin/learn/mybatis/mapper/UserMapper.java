package top.chuqin.learn.mybatis.mapper;

import org.apache.ibatis.annotations.*;
import top.chuqin.learn.mybatis.domain.User;

/**
 * Created by wengchuqin on 2017/12/25.
 */
public interface UserMapper {

    @Select("SELECT * FROM tb_user WHERE loginname = #{loginname} and password = #{password}")
    User findWithLoginnameAndPassword(@Param("loginname") String loginname,
                                      @Param("password") String password);
}
