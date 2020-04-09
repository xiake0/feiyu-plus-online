package com.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.base.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @Author: xiake
 * @Date: 2020/4/9 16:47
 * @Description:
 **/
@Data
@TableName("t_comment")
//视频评论
public class Comment extends BaseEntity{

     //评论内容
     private String comment;

     //评论发布时间
     @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
     private Date time;

     //发布人id
     private String ownerId;

     //发布人
     @TableField(exist = false)
     private User user;
}
