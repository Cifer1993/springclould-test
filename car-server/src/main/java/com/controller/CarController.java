package com.controller;

import com.FeignClient.UserFeignClient;
import com.configure.RequestLog;
import com.dao.UserDao;
import com.entity.User;
import com.service.AspectTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Administrator on 2018/11/6.
 */
@RestController
public class CarController {

    @Autowired
    private AspectTestService aspectTestService;

    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private UserDao userDao;
    @Autowired
    private UserFeignClient userFeignClient;

//    @GetMapping("/user/getUserById/{id}")
//    public User findById(@PathVariable Long id) {
//
//        return carFeignClient.findUserById(id);
//    }

    @GetMapping("/getAspect")
    @RequestLog
    public String getAspect(){
        System.out.println("111");
        aspectTestService.AspectB();
        return "111";
    }

    @GetMapping("/getUserById/{id}")
    @RequestLog
    public User getUserById(@PathVariable Long id){
        User user = userFeignClient.findUserById(id);
        try {
//            Thread.sleep(6000);
            System.out.println(InetAddress.getLocalHost());
        } catch (UnknownHostException e) {
            e.printStackTrace();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
        }
        return user;
    }
}
