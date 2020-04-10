package com.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.entity.Role;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import java.util.List;

/**
 * @Author: xiake
 * @Date: 2019/12/22 22:01
 * @Description:
 **/
public interface RoleMapper extends BaseMapper<Role> {

    @Select("SELECT t1.id,t1.name,t1.description,t1.del_flag,t1.create_time," +
            "t1.create_by,t1.update_by,t1.update_time FROM t_role t1,t_user_role t2 " +
            "WHERE t1.id=t2.role_id AND t2.user_id=#{userId}")
    List<Role> getRolesByUserId(@Param("userId") String userId);

    @Select("select * from t_role,t_role_menu where t_role.id = t_role_menu.role_id and " +
            "menu_id = #{menuId}")
    List<Role> getRoleByMenuId(String menuId);

    @Select("select id,name,description from t_role where del_flag = 0")
    List<Role> getAllRoles();

}
