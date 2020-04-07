package com.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.base.BaseEntity;
import com.constant.SysConstants;
import lombok.Data;

import java.util.List;

/**
 * @Author: xiake
 * @Date: 2020/1/5 23:19
 * @Description:
 **/
@Data
@TableName(value = "t_menu")
//权限菜单
public class Menu extends BaseEntity {

    //菜单/权限名称
    private String name;

    //层级
    private Integer level;

    //菜单标题
    private String title;

    //是否启用 0.禁用 1.启用
    private Integer isActive = SysConstants.STATUS_NORMAL;

    //页面路径/资源链接url
    private String path;

    //图标
    private String icon;

    //按钮权限类型
    private Integer buttonType;

    //菜单类型 0.菜单 1.按钮
    private Integer type;

    //排序值
    private Integer sortOrder;

    //前端组件
    private String component;

    //父主键
    private String parentId;

    //网页链接
    private String url;

    //子菜单/权限
    @TableField(exist = false)
    private List<Menu> children;

    //角色列表
    @TableField(exist = false)
    private List<Role> roles;
}
