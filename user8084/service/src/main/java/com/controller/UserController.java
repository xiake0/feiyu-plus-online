package com.controller;

import com.entity.User;
import com.service.UserService;
import com.utils.ResultUtil;
import com.vo.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: xiake
 * @Date: 2020/4/6 14:49
 * @Description:
 **/
@RestController
@RequestMapping("sys")
//用户管理
public class UserController {

    @Autowired
    private UserService userService;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("get")
    public Result<User> getUser(){
        return new ResultUtil<User>().setData(userService.getUserByUsername("admin"));
    }

}

