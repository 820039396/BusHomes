package com.qf.j1902.service.impl;

import com.qf.j1902.service.LoginService;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/6/29.
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Override
    public String ifLogin(String name, String password) {
        return "登录失败";
    }
}
