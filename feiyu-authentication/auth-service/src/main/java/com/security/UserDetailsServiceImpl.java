package com.security;

import com.entity.SecurityUserDetails;
import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * @Author: xiake
 * @Date: 2020/1/5 23:25
 * @Description:
 **/
@Component
public class UserDetailsServiceImpl implements UserDetailsService {

//    @Autowired
//    private UserClient userClient;
      @Autowired
      private UserService userService;

    public User getCurrentUser() {
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userService.getUserByUsername(s);
        return new SecurityUserDetails(user);
    }
}
