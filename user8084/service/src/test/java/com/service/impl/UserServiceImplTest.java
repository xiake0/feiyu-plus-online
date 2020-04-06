package com.service.impl;

import com.UserServiceApplication;
import com.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SuppressWarnings("all")
@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserServiceApplication.class)
public class UserServiceImplTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void getUser(){
        System.out.println(userMapper.getUserByUsername("admin"));
    }
}