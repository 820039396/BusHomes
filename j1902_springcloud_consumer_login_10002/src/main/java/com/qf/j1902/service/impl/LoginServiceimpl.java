package com.qf.j1902.service.impl;

import com.qf.j1902.service.LoginService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2019/6/29.
 */
@Service
public class LoginServiceimpl implements LoginService {
    @Override
    public String ifLogin(String name, String password) {
        return "登录失败";
    }
}
