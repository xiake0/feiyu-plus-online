package com.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.entity.User;

/**
 * @Author: xiake
 * @Date: 2020/4/6 14:47
 * @Description:
 **/
public interface UserService extends IService<User> {
    User getUserByUsername(String username);

//    IPage<User> getByCondition(PageVo pageVo, User user, DateVo dateVo);
//
//    void addUser(User user);
//
//    Integer getCounts(String username);
}
