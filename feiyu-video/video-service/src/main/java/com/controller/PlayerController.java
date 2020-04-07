package com.controller;

import com.service.PlayerService;
import com.utils.QiniuUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileInputStream;
import java.io.IOException;

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
    private PlayerService videoService;

    @Autowired
    private QiniuUtil qiniuUtil;

    @PutMapping("qiniu")
    public String uploadImgQiniu(@RequestParam(value = "editormd-image-file",required = false) MultipartFile multipartFile) throws IOException {
        logger.info(multipartFile.toString());
        FileInputStream inputStream = (FileInputStream) multipartFile.getInputStream();
        logger.info(inputStream.toString());
        String path = qiniuUtil.uploadImg(inputStream, "admin"+"_"+111);
        return path;
    }
}
