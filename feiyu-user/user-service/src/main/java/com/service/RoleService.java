package com.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.entity.Role;

import java.util.List;

/**
 * @Author: xiake
 * @Date: 2019/12/22 22:02
 * @Description:
 **/
public interface RoleService extends IService<Role> {
    List<Role> getAllRoles();
}
