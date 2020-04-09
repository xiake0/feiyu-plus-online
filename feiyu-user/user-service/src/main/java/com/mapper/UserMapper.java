package com.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Author: xiake
 * @Date: 2020/4/6 14:45
 * @Description:
 **/
public interface UserMapper extends BaseMapper<User> {

    @Select("select * from t_user where username = #{username} limit 1;")
    User getUserByUsername(@Param("username") String username);

//    IPage<User> getByCondition(Page<User> page, @Param("u") User user,
//                               @Param("d") DateVo dateVo, @Param("s") String sort,
//                               @Param("o") String order);
//
//    @Select("select count(*) from t_user where username = #{username}")
//    Integer getCounts(String username);

    @Select("select id,username,avatar from t_user where id = #{id} limit 1;")
    User getUserByUserId(@Param("id") String id);
}
