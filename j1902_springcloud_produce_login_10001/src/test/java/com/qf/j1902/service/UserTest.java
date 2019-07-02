package com.qf.j1902.service;

import com.qf.j1902.mapper.UserMapper;
import com.qf.j1902.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by funkh on 2019/6/29.
 */
@SpringBootTest
@Configuration("com.qf.j1902.mapper")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserTest {
    @Resource
    private UserMapper userMapper;


    @Test
    public void test1(){
        List<User> all = userMapper.findAll();
        for (User user :all ) {
            System.out.println(user);
        }
    }
}
