package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2019/1/7.
 */

@RestController
public class AggregationController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/aggregateServer")
    public Map<String,String> findServer(){
        Map<String,String> map = new HashMap<String, String>();
        String userIpAndPort = restTemplate.getForObject("http://user-server/userServer/getIpAndPort",String.class);
        map.put("UserServer",userIpAndPort);
        String policyIpAndPort = restTemplate.getForObject("http://policy-server/policy-server/getIpAndPort",String.class);
        map.put("Policy-Server",policyIpAndPort);
        return map;
    }
}
