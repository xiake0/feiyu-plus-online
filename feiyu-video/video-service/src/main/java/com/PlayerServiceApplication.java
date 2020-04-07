package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: xiake
 * @Date: 2020/4/7 15:24
 * @Description:
 **/
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.mapper")
public class PlayerServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(PlayerServiceApplication.class,args);
    }

}
