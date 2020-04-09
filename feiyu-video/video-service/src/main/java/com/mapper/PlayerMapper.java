package com.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.entity.Player;
import org.apache.ibatis.annotations.Select;

/**
 * @Author: xiake
 * @Date: 2020/4/7 15:22
 * @Description:
 **/
public interface PlayerMapper extends BaseMapper<Player> {

    @Select("select * from t_player")
    Player getRecommend();
}
