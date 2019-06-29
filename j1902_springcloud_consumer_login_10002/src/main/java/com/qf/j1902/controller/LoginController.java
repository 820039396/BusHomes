package com.qf.j1902.controller;

import com.qf.j1902.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/6/29.
 */
@RestController
public class LoginController {
    @Autowired
    LoginService loginService;
    @RequestMapping(value = "login")
    public String IsLogin(String name,String password){
        return loginService.ifLogin(name,password);
    }
}
