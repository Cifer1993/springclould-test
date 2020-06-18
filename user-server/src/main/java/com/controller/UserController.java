package com.controller;

import com.dao.UserDao;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.client.serviceregistry.Registration;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Administrator on 2018/10/29.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private Registration registration;

    @GetMapping("/getUserById/{id}")
    public User findUserById(@PathVariable("id") Long id) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        User user = userService.getUserById(id);
        try {
            System.out.println(InetAddress.getLocalHost());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return user;
    }

    @GetMapping("/say")
    public void sayHello(){
        System.out.println("================================"+"1111111111"+"=========================");
    }

    @GetMapping("/getIpAndPort")
    public String getIpAndPort() {
        return registration.getHost() + ":" + registration.getPort();
    }
}
