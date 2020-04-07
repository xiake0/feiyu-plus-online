package com.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.entity.User;
import com.mapper.UserMapper;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Override
    public User getUserByUsername(String username) {
        return userMapper.getUserByUsername(username);
    }

//    @Autowired
//    private RoleMapper roleMapper;
//
//    @Autowired
//    private BCryptPasswordEncoder encoder;

//    /**
//     * 根据用户名获取用户
//     *
//     * @param username
//     * @return
//     */
//    @Override
//    @Transactional
//    public User getUserByUsername(String username) {
//        User user = userMapper.getUserByUsername(username);
//        System.out.println(user);
//        List<Role> roles = roleMapper.getRolesByUserId(user.getId());
//        System.out.println(roles);
//        //TODO 需添加异常处理
//        if (null != roles || roles.size() > 0) {
//            user.setRoles(roles);
//        }
//        return user;
//    }
//
//    /**
//     * 根据条件分页查询用户
//     *
//     * @param page
//     * @param user
//     * @param dateVo
//     * @param order
//     * @return
//     */
//    @Override
//    public IPage<User> getByCondition(PageVo pageVo, User user, DateVo dateVo) {
//        Page<User> userPage = new Page<>(pageVo.getPageNumber(), pageVo.getPageSize());
//        IPage<User> iPage = userMapper.getByCondition(userPage, user, dateVo, pageVo.getSort(), pageVo.getOrder());
//        return iPage;
//    }
//
//    /**
//     * 添加新用户
//     *
//     * @param user
//     */
//    @Override
//    public void addUser(User user) {
//        user.setPassword(encoder.encode(user.getPassword()));
//        userMapper.insert(user);
//    }
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
