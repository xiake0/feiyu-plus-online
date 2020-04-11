package com.api;

import com.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: xiake
 * @Date: 2020/4/10 23:35
 * @Description:
 **/
public interface UserApi {

    @GetMapping("sys/getU")
    User getUserByUserId(@RequestParam("uid")String uid);

    @GetMapping("sys/get")
    User getUserByUsername(@RequestParam("username")String username);

    @RequestMapping("sys/loginPage")
    void loginPage();

    /**
     * 用户验证
     * @param username
     * @param password
     * @return
     */
    @GetMapping("query")
    User queryUser(@RequestParam("username")String username, @RequestParam("password")String password);
}
