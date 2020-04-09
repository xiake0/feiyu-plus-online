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

//    @Select("SELECT t1.id,t1.comment,t1.time,t1.owner_id,t1.create_time," +
//            "t1.create_by,t1.update_time,t1.update_by,t1.del_flag FROM " +
//            "t_comment t1,t_player_comment t2, t_player t3 WHERE t1.id=t2.cid " +
//            "AND t2.pid=t3.id AND t3.id=#{id}")
    IPage<Comment> getComment(Page<Comment> page, @Param("id") String id);
}
