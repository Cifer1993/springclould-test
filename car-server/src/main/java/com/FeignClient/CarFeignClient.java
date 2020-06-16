package com.FeignClient;

import com.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2019/1/15.
 */

@FeignClient(name="message-server")
public interface CarFeignClient {

    @RequestMapping(value="/userServer/getUserById/{id}", method= RequestMethod.GET)
    public User findUserById(@PathVariable("id") Long id);
}
