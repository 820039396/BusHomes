package com.qf.j1902.service;

import com.qf.j1902.service.impl.LoginServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2019/6/29.
 */
@FeignClient(value = "xp-produce-login",fallback = LoginServiceImpl.class)
public interface LoginService {
    @RequestMapping(value = "/login")
    public String ifLogin(@RequestParam("name") String name, @RequestParam("password") String password);

}
