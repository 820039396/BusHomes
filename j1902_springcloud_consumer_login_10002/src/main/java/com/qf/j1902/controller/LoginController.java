package com.qf.j1902.controller;

import com.qf.j1902.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2019/6/29.
 */
/*@RestController*/
@Controller
public class LoginController {
    @Autowired
    LoginService loginService;

    @RequestMapping(value = "/")
    public String index(){
        return "index.html";
    }

    @RequestMapping(value = "loginindex")
    public String login(){
        return "login";
    }

    @RequestMapping(value = "login")
    @ResponseBody
    public String IsLogin(@RequestParam("name")String name, @RequestParam("password")String password){
        
        return loginService.ifLogin(name,password);
    }
}
