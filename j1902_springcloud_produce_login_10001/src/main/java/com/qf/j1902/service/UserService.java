package com.qf.j1902.service;

import com.qf.j1902.pojo.User;

import java.util.List;

/**
 * Created by Administrator on 2019/6/28.
 */
public interface UserService {
    //查询所有用户信息
    public List<User> findAll();

}
