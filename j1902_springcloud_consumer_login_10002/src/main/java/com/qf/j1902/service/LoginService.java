package com.qf.j1902.service;

import com.qf.j1902.service.impl.LoginServiceimpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2019/6/29.
 */
@FeignClient(value = "server-zuul",fallback = LoginServiceimpl.class)
public interface LoginService {
    @RequestMapping(value = "/api-a/login")
    public String ifLogin(@RequestParam("name") String name, @RequestParam("password") String password);

}
