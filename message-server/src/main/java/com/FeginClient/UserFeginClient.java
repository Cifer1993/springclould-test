package com.FeginClient;

import feign.hystrix.FallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.Entity.User;

/**
 * Created by Administrator on 2019/1/10.
 */
@FeignClient(name = "car-server",fallback = UserFeignClientFallback.class)
public interface UserFeginClient {
    @RequestMapping(value="/userServer/getUserById/{id}",method = RequestMethod.GET)
    public User findUserById(@PathVariable("id") Long id);

    @RequestMapping(value="/getUserByName/{name}", method = RequestMethod.GET)
    public User findUserByName(@PathVariable("name") String name);
}

@Component
class UserFeignClientFallback implements UserFeginClient {

    @Override
    public User findUserById(Long id) {
        User user = new User();
        user.setId(1L);
        user.setName("fallback");
        return user;
    }

    @Override
    public User findUserByName(String name) {
        User user = new User();
        user.setId(1L);
        user.setName("fallback");
        return user;
    }
}

