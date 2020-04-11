package com.client;

import com.api.UserApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author: xiake
 * @Date: 2020/4/10 23:21
 * @Description:
 **/
@FeignClient(value = "user-service")
public interface UserClient extends UserApi{
}
