package com.qf.j1902.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/6/29.
 */
@RestController
public class User_Login_Controller {
    @RequestMapping(value = "login")
    public String isLogin(String name,String password){
        return "用户名："+name+" 密码："+password;
    }
}
