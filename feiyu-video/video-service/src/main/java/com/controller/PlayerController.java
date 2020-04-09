package com.controller;

import com.entity.Player;
import com.service.PlayerService;
import com.utils.QiniuUtil;
import com.utils.ResultUtil;
import com.vo.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

/**
 * @Author: xiake
 * @Date: 2020/4/7 15:30
 * @Description:
 **/
@RestController
@RequestMapping("video")
public class PlayerController {

    private static final Logger logger = LoggerFactory.getLogger(QiniuUtil.class);

    @Autowired
    private PlayerService playerService;

    @Autowired
    private QiniuUtil qiniuUtil;

    @PutMapping("qiniu")
    public String uploadImgQiniu(@RequestParam(value = "editormd-image-file",required = false) MultipartFile multipartFile) throws IOException {
        logger.info(multipartFile.toString());
        FileInputStream inputStream = (FileInputStream) multipartFile.getInputStream();
        logger.info(inputStream.toString());
        String path = qiniuUtil.uploadImg(inputStream, "admin"+"_"+11);
        return path;
    }

    //获取推荐视频
    @GetMapping("recommend")
    public Result<List<Player>> getRecommendVideo(){
     return new ResultUtil<List<Player>>().setData(playerService.getRecommend());
    }
}
