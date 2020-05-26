package com.controller;

import com.FeginClient.UserFeginClient;
import com.FeginClient.UserNameFeginClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.Entity.User;

/**
 * Created by Administrator on 2019/1/10.
 */
@RestController
public class GetCarController {

    @Autowired
    private UserFeginClient userFeginClient;

    @Autowired
    private UserNameFeginClient userNameFeginClient;

    @GetMapping("/getUserById/{id}")
    public User findUserById(@PathVariable Long id){
        return this.userFeginClient.findUserById(id);
    }

    @GetMapping("/getUserByName/{name}")
    public User findUserByName(@PathVariable String name){
        return this.userNameFeginClient.findUserByName(name);
    }
}
