package com.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.entity.Comment;
import com.mapper.CommentMapper;
import com.mapper.UserMapper;
import com.service.CommentService;
import com.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: xiake
 * @Date: 2020/4/9 20:32
 * @Description:
 **/
@SuppressWarnings("all")
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Autowired
    private UserMapper userMapper;


    //获取视频评论
    @Override
    public IPage<Comment> getComment(PageVo pageVo,String pid) {
        Page<Comment> commentPage=new Page<>(pageVo.getPageNumber(),pageVo.getPageSize());
        IPage<Comment> iPage=commentMapper.getComment(commentPage,pid);
//        for(IPage<Comment> ip: iPage){
//
//        }

//        List<Comment> comments=commentMapper.getComment(Page<Comment> page,pid);
//        for(Comment comment:comments){
//            User user=userMapper.getUserByUserId(comment.getOwnerId());
//            comment.setUser(user);
//        }
        return iPage;
    }
}
