package com.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.base.BaseEntity;
import lombok.Data;
import java.util.List;

/**
 * @Author: xiake
 * @Date: 2019/12/17 22:13
 * @Description:
 **/
@Data
@TableName(value = "t_user")
//用户
public class User extends BaseEntity {


    //用户名
    private String username;

    //登录密码
    private String password;

    //用户类型
    private Integer type;

    //用户状态，可用 1
    private Boolean enabled;

    //手机号
    private String mobile;

    //备注
    private String remark;

    //地址
    private String address;

    //0女 1男 2保密
    private Integer gender;

    //用户头像
    private String avatar;

//    @ApiModelProperty(value = "用户拥有的角色")
//    @TableField(exist = false)
//    private List<Role> roles;
//
//    @ApiModelProperty(value = "用户拥有的权限")
//    @TableField(exist = false)
//    private List<Menu> permissions;
}
