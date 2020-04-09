package com.service.impl;


import com.PlayerServiceApplication;
import com.mapper.CommentMapper;
import com.service.CommentService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SuppressWarnings("all")
@RunWith(SpringRunner.class)
@SpringBootTest(classes = PlayerServiceApplication.class)
public class CommentServiceImplTest {

    @Autowired
    private CommentMapper commentMapper;

    @Autowired
    private CommentService commentService;

//    @Test
//    public void get(){
//        System.out.println(commentService.getComment("1"));
//    }

}