package com.shoukue.sqlite.service.impl;

import com.shoukue.sqlite.mapper.UserMapper;
import com.shoukue.sqlite.pojo.User;
import com.shoukue.sqlite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author dengwenlong
 * 2020/11/18
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findById(Long id) {
        User user = userMapper.findById(id);
        return user;
    }
}
