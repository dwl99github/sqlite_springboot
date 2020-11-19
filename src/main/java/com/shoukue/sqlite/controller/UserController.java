package com.shoukue.sqlite.controller;

import com.shoukue.sqlite.pojo.User;
import com.shoukue.sqlite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dengwenlong
 * 2020/11/18
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/test/{id}")
    public User findById(@PathVariable Long id){
        User user = userService.findById(id);
        return user;
    }

    @GetMapping("/getUser")
    public User getUser(String username){
        User user = userService.getUser(username);
        return user;
    }
}
