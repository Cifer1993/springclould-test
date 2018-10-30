package com.controller;

import com.dao.UserDao;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/10/29.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getById")
    public User findById(Long id) {
        User user = userService.getUserById(id);
        return user;
    }

    @RequestMapping("/say")
    public void sayHello(){
        System.out.println("================================"+"1111111111"+"=========================");
    }
}
