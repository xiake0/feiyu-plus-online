package com.api;

import com.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: xiake
 * @Date: 2020/4/10 23:35
 * @Description:
 **/
public interface UserApi {

    @GetMapping("sys/getU")
    User getUserByUserId(@RequestParam("uid")String uid);
}
