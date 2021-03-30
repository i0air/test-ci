package com.jqtx.framework.security.service;

import com.jqtx.framework.generated.tables.pojos.User;
import com.jqtx.framework.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.annotation.Resource;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Resource
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUid(username).orElseThrow(() -> new UsernameNotFoundException("用户不存在：" + username));

        return UserDetailsImpl.build(user);
    }
}
