package com.controller;

import com.FeignClient.CarFeignClient;
import com.configure.RequestLog;
import com.dao.UserDao;
import com.entity.User;
import com.netflix.discovery.DiscoveryClient;
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
//    @Autowired
//    private CarFeignClient carFeignClient;

    @Autowired
    private AspectTestService aspectTestService;

    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private UserDao userDao;

//    @GetMapping("/user/getUserById/{id}")
//    public User findById(@PathVariable Long id) {
//
//        return carFeignClient.findUserById(id);
//    }

    @GetMapping("/getAspect")
    @RequestLog
    public String getAspect(){
//        redisTemplate.opsForValue().set("username:1","cifer");
//        String name = (String) redisTemplate.opsForValue().get("username:1");
        System.out.println("111");
        aspectTestService.AspectB();
        return "111";
//        aspectTestService.AspectB();
    }

    @GetMapping("/userServer/getUserById/{id}")
    public User getUserById(@PathVariable Long id){
        User user = userDao.queryUserById(id);
        try {
            System.out.println(InetAddress.getLocalHost());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return user;
    }
}
