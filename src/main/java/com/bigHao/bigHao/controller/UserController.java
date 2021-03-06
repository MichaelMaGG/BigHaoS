package com.bigHao.bigHao.controller;

import com.bigHao.bigHao.entity.UserInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mazhuang on 2018/6/15.
 */
@RestController
public class UserController {

    @RequestMapping("/hello")
    public String getHello(String name) {
        StringBuilder sb = new StringBuilder("welcome to BigHaoS! ");
        sb.append(name).append("!");
        return sb.toString();
    }

    @RequestMapping("/getUserById")
    public String getUserById() {
        return "I am an user!";
    }

    @RequestMapping("/user")
    public UserInfo getUserInfo() {
        UserInfo userInfo = new UserInfo();
        userInfo.setId("1");
        userInfo.setName("Hao");

        return userInfo;
    }
}
