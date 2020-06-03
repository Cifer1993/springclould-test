package com.controller;

import com.FeginClient.UserFeginClient;
import com.FeginClient.UserNameFeginClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.Entity.User;

/**
 * Created by Administrator on 2019/1/10.
 */
@RestController
public class GetCarController {

    @Autowired
    private UserFeginClient userFeginClient;
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    @Autowired
    private UserNameFeginClient userNameFeginClient;

    @GetMapping("/getUserById/{id}")
    public User findUserById(@PathVariable Long id){
        return this.userFeginClient.findUserById(id);
    }

    @GetMapping("/getUserByName/{name}")
    public User findUserByName(@PathVariable String name){
        return this.userNameFeginClient.findUserByName(name);
    }

    @GetMapping("/kafka")
    public void kafka(){
        long time = System.currentTimeMillis();
        for(int i=0; i<10000; i++){
            kafkaTemplate.send("myReplicated",Integer.valueOf(i).toString());
            System.out.println(Integer.valueOf(i).toString());
        }
        long nowTime = System.currentTimeMillis();
        System.out.println("共用时"+(nowTime - time));
    }
}
