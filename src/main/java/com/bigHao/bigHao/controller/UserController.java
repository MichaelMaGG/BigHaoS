package com.bigHao.bigHao.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mazhuang on 2018/6/15.
 */
@RestController
public class UserController {

    @RequestMapping("/hello")
    public String getHello() {
        return "welcome to BigHaoS!";
    }

    @RequestMapping("/getUserById")
    public String getUserById() {
        return "I am an user!";
    }

}
