package com.controller;

import com.entity.User;
import com.service.UserService;
import com.utils.ResultUtil;
import com.utils.UserDetailsUtils;
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

    @GetMapping("/currentUser")
    //获取当前登录用户
    public Result<User> currentUser() {
        return new ResultUtil<User>().setData(UserDetailsUtils.getCurrentUserDetails());
    }

    @RequestMapping("/login_p")
    public Result<Object> loginPage() {
        return new ResultUtil<Object>().setErrorMsg(302, "登录过期，请重新登录！");
    }

    @GetMapping("get")
    public Result<User> getUser(){
        userService.addUser();
        return new ResultUtil<User>().setSuccessMsg("success");
    }

    @GetMapping("add")
    public Result<Object> addUser(){
        userService.addUser();
        return new ResultUtil<Object>().setSuccessMsg("success");
    }

}

