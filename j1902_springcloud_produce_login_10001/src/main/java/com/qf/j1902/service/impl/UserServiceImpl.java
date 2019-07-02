package com.qf.j1902.service.impl;

import com.qf.j1902.mapper.UserMapper;
import com.qf.j1902.pojo.User;
import com.qf.j1902.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2019/6/28.
 */
@Service
public class UserServiceImpl implements UserService{
    @Resource
    UserMapper userMapper;
    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
