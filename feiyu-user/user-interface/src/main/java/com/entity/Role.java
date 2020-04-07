package com.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.base.BaseEntity;
import lombok.Data;

import java.util.List;

/**
 * @Author: xiake
 * @Date: 2019/12/20 23:02
 * @Description:
 **/
@Data
@TableName(value = "t_role")
//角色
public class Role extends BaseEntity {

    //角色名
    private String name;

    //描述
    private String description;

    //角色权限
    @TableField(exist = false)
    private List<Menu> permissions;
}
