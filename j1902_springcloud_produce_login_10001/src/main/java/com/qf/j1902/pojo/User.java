package com.qf.j1902.pojo;

import lombok.Data;

/**
 * Created by Administrator on 2019/6/28.
 */
@Data
public class User {
    private int id;
    private String username;
    private String password;
    private String name;
    private String salt;
    private String phone;
    private String email;
    private String status;
    private String create_time;
    private String is_super;
    private String consumer;
    private String remark;
    private String dept;

}
