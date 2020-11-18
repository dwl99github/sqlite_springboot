package com.shoukue.sqlite.mapper;

import com.shoukue.sqlite.pojo.User;

public interface UserMapper {
    User findById(Long id);
}
