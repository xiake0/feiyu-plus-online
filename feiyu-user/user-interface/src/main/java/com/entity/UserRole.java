package com.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.base.BaseEntity;
import lombok.Data;

/**
 * @Author: xiake
 * @Date: 2019/12/21 22:57
 * @Description:
 **/
@Data
@TableName(value = "t_user_role")
//用户角色关联
public class UserRole extends BaseEntity {

    //用户id
    private String userId;

    //角色id
    private String roleId;
}
