package com.qf.j1902.mapper;

import com.qf.j1902.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by funkh on 2019/6/29.
 */
@Mapper
public interface UserMapper {
    //查询所有用户信息
    public List<User> findAll();
}
