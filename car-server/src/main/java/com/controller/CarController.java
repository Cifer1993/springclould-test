package com.controller;

import com.FeignClient.CarFeignClient;
import com.configuration.RequestLog;
import com.entity.User;
import com.service.AspectTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/11/6.
 */
@RestController
public class CarController {
    @Autowired
    private CarFeignClient carFeignClient;

    @Autowired
    private AspectTestService aspectTestService;

    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {

        return carFeignClient.findUserById(id);
    }

    @GetMapping("/getAspect")
    public String getAspect(){
//        redisTemplate.opsForValue().set("username:1","cifer");
//        String name = (String) redisTemplate.opsForValue().get("username:1");
        System.out.println("111");
        aspectTestService.AspectB();
        return "111";
//        aspectTestService.AspectB();
    }
}
