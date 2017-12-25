package top.chuqin.learn.mybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import top.chuqin.learn.mybatis.domain.User;
import top.chuqin.learn.mybatis.mapper.UserMapper;
import top.chuqin.learn.mybatis.service.UserService;

/**
 * Created by wengchuqin on 2017/12/25.
 */
@Transactional
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Transactional(readOnly=true)
    @Override
    public User login(String loginname, String password) {
        return userMapper.findWithLoginnameAndPassword(loginname, password);
    }
}
