package com.policy.controller;

import com.policy.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2019/1/7.
 */
@FeignClient(name="user-server")
public interface UserFeginClient {

    @RequestMapping(value="/getUserById/{id}", method= RequestMethod.GET)
    public User findUserById(@PathVariable("id") Long id);
}
