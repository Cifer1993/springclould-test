package com.FeginClient;

import com.configuration.UserFeignDisableHystrixConfiguration;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.Entity.User;

/**
 * Created by Administrator on 2019/1/10.
 */
@FeignClient(name = "user-server",configuration = UserFeignDisableHystrixConfiguration.class)
public interface UserNameFeginClient {
    @RequestMapping(value="/getUserByName/{name}", method = RequestMethod.GET)
    public User findUserByName(@PathVariable("name") String name);
}
