package com.utils;

import com.entity.SecurityUserDetails;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @Author: xiake
 * @Date: 2020/1/9 22:52
 * @Description:
 **/
public class UserDetailsUtils {
    public static SecurityUserDetails getCurrentUserDetails() {
        return (SecurityUserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
