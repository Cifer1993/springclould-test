package com.FeginClient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.Entity.User;

/**
 * Created by Administrator on 2019/1/10.
 */
@FeignClient(name="user-server",fallback = UserFeignClientFallback.class)
public interface UserFeginClient {
    @RequestMapping(value="/userServer/getUserById/{id}",method = RequestMethod.GET)
    public User findUserById(@PathVariable("id") Long id);
}

@Component
class UserFeignClientFallback implements UserFeginClient{
    @Override
    public User findUserById(Long id) {
        User user = new User();
//        user.setId(-1L);
//        user.setName("默认用户");
//        user.getAge(26);
        return user;
    }
}

