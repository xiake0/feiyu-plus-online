package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: xiake
 * @Date: 2020/2/2 14:27
 * @Description:
 **/
@SpringBootApplication
@EnableEurekaServer
public class RegistryApplication {

    public static void main(String[] args) {

        SpringApplication.run(RegistryApplication.class,args);
    }

}