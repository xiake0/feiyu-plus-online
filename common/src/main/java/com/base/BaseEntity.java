package com.base;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.utils.SnowFlakeUtil;
import lombok.Data;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author: xiake
 * @Date: 2020/4/6 14:25
 * @Description:
 **/
@Data
public abstract class BaseEntity extends Model implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField(value = "id")
    private String id = String.valueOf(SnowFlakeUtil.getFlowIdInstance().nextId());

    @TableField(value = "create_time", fill = FieldFill.INSERT)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @JsonIgnore
    @TableField(value = "create_by", fill = FieldFill.INSERT)
    private String createBy;

    @JsonIgnore
    @TableField(value = "update_time", fill = FieldFill.UPDATE)
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    @JsonIgnore
    @TableField(value = "update_by", fill = FieldFill.UPDATE)
    private String updateBy;

    @JsonIgnore
    @TableLogic
    @TableField(value = "del_flag", fill = FieldFill.INSERT)
    private Integer delFlag;
}
