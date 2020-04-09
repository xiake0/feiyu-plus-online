package com.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.base.BaseEntity;
import lombok.Data;

/**
 * @Author: xiake
 * @Date: 2020/4/9 20:22
 * @Description:
 **/
@Data
@TableName("t_player_comment")
//视频评论关联表
public class PlayerComment extends BaseEntity{

    //视频id
    private String pid;

    //评论id
    private String cid;
}
