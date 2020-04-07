package com.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.base.BaseEntity;
import lombok.Data;

/**
 * @Author: xiake
 * @Date: 2020/4/7 15:12
 * @Description:
 **/
@Data
@TableName("t_player")
//视频
public class Player extends BaseEntity{

    //视频名称
    private String name;

    //观看数量
    private Integer view;

    //评论数
    private Integer comment;

    //地址
    private String url;

    //封面
    private String pic;
}
