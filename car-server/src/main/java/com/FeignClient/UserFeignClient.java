package com.FeignClient;

import com.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2019/1/15.
 */

@FeignClient(name="user-server", fallback = UserFeignClientFallback.class)
public interface UserFeignClient {

    @RequestMapping(value="/getUserById/{id}", method= RequestMethod.GET)
    public User findUserById(@PathVariable("id") Long id);
}

@Component
class UserFeignClientFallback implements UserFeignClient {

    @Override
    public User findUserById(Long id) {
        User user = new User();
        user.setId(1L);
        user.setName("fallback");
        return user;
    }
}
