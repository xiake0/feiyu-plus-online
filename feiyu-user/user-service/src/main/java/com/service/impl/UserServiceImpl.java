package com.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.entity.Role;
import com.entity.User;
import com.mapper.RoleMapper;
import com.mapper.UserMapper;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: xiake
 * @Date: 2020/4/6 14:48
 * @Description:
 **/
@SuppressWarnings("all")
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RoleMapper roleMapper;

//    @Autowired
//    private BCryptPasswordEncoder encoder;

    /**
     * 根据用户名获取用户
     *
     * @param username
     * @return
     */
    @Override
    @Transactional
    public User getUserByUsername(String username) {
        User user = userMapper.getUserByUsername(username);
        System.out.println(user);
        List<Role> roles = roleMapper.getRolesByUserId(user.getId());
        System.out.println(roles);
        //TODO 需添加异常处理
        if (null != roles || roles.size() > 0) {
            user.setRoles(roles);
        }
        return user;
    }

    /**
     * 添加新用户
     *
     * @param user
     */
    @Override
    public void addUser() {
        User user=new User();
        user.setUsername("tss");
        user.setPassword("rrr");
        userMapper.insert(user);
    }

    @Override
    public User getUserByUserId(String uid) {
        return userMapper.getUserByUserId(uid);
    }

//
//    /**
//     * 验证数据库是否存在该用户
//     *
//     * @param username
//     * @return
//     */
//    @Override
//    public Integer getCounts(String username) {
//        return userMapper.getCounts(username);
//    }

}
