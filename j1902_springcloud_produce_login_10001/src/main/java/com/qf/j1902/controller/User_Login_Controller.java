package com.qf.j1902.controller;

import com.qf.j1902.pojo.User;
import com.qf.j1902.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/6/29.
 */
//@Controller
@RestController
public class User_Login_Controller {
    //服务端口
    @Value("${server.port}")
    private String port;

    @Autowired
    UserService userService;

    @RequestMapping(value = "login")
    public String isLogin(String name,String password){
        User requestUser = new User(name, password);
        List<User> allUser = userService.findAll();
        List<User> listUser = new ArrayList<>();
        for (User alluser:allUser) {
            User user = new User(alluser.getUsername(), alluser.getPassword());
            listUser.add(user);
        }
        if(!listUser.contains(requestUser)){
             return "xxxx";
        }
        return requestUser.toString();
    /*return "名字"+name+"密码："+password;*/
    }
}
