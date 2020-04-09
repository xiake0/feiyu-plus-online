package com.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.entity.Player;

import java.util.List;

/**
 * @Author: xiake
 * @Date: 2020/4/7 15:22
 * @Description:
 **/
public interface PlayerService  extends IService<Player> {

    List<Player> getRecommend();
}
