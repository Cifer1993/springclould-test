package com.contorller;

import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2018/11/4.
 */
@RestController
@RequestMapping("/policy")
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        return this.restTemplate.getForObject("http://provider-user/" + id, User.class);
    }

    @GetMapping("/user/say/{str}")
    public String say(@PathVariable String str){
        return str;
    }

    @GetMapping("/user/getIpAndPort")
    public String getIpAndPort() {
        return this.restTemplate.getForObject("http://provider-user/getIpAndPort", String.class);
    }
}
