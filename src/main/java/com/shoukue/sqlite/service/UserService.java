package com.shoukue.sqlite.service;


import com.shoukue.sqlite.pojo.User;

/**
 * User业务层接口
 * @author dengwenlong
 * 2020/11/15
 */
public interface UserService {
    User findById(Long id);
}
