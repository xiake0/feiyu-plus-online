package com.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.entity.Comment;
import com.service.CommentService;
import com.utils.ResultUtil;
import com.vo.PageVo;
import com.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: xiake
 * @Date: 2020/4/9 20:38
 * @Description:
 **/
@RestController
@RequestMapping("comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping("list")
    public Result<IPage<Comment>> getComment(@ModelAttribute PageVo pageVo,String pid){

        IPage<Comment> iPage=commentService.getComment(pageVo,pid);
        return new ResultUtil<IPage<Comment>>().setData(iPage);
    }
}
