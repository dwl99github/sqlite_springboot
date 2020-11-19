package com.shoukue.sqlite.mapper;

import com.shoukue.sqlite.pojo.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Select("select * from user where user_name = 'lisi'")
    User findById(Long id);

    User getUser(String username);
}
