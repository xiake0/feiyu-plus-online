package com.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.entity.Comment;
import com.vo.PageVo;

/**
 * @Author: xiake
 * @Date: 2020/4/9 20:31
 * @Description:
 **/
public interface CommentService extends IService<Comment> {

    IPage<Comment> getComment(PageVo pageVo,String pid);
}
