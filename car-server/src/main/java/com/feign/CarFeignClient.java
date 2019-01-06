package com.feign;

import com.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2018/11/5.
 */
@FeignClient(name="provider-user")
public interface CarFeignClient {
    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public User findById(@PathVariable("id") Long car);
}
