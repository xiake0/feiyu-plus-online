package com.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.entity.Comment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: xiake
 * @Date: 2020/4/9 20:30
 * @Description:
 **/
public interface CommentMapper extends BaseMapper<Comment> {

    IPage<Comment> getComment(Page<Comment> page, @Param("id") String id);
}
