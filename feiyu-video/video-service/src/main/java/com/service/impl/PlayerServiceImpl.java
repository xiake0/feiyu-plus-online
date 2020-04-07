package com.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.entity.Player;
import com.mapper.PlayerMapper;
import com.service.PlayerService;
import org.springframework.stereotype.Service;

/**
 * @Author: xiake
 * @Date: 2020/4/7 15:23
 * @Description:
 **/
@SuppressWarnings("all")
@Service
public class PlayerServiceImpl extends ServiceImpl<PlayerMapper, Player> implements PlayerService {
}
