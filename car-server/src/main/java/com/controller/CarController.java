package com.controller;

import com.entity.User;
import com.feign.CarFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {

        return carFeignClient.findById(id);
    }
}
