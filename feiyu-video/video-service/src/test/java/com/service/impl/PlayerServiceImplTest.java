package com.service.impl;

import com.PlayerServiceApplication;
import com.mapper.PlayerMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SuppressWarnings("all")
@RunWith(SpringRunner.class)
@SpringBootTest(classes = PlayerServiceApplication.class)
public class PlayerServiceImplTest {

    @Autowired
    private PlayerMapper playerMapper;

    @Test
    public void get(){
        System.out.println(playerMapper.getRecommend());
    }
}