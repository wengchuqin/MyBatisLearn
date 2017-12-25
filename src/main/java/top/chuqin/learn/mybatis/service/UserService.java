package top.chuqin.learn.mybatis.service;

import top.chuqin.learn.mybatis.domain.User;

/**
 * Created by wengchuqin on 2017/12/25.
 */
public interface UserService {
    User login(String loginname, String password);
}
