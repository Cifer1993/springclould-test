package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2019/1/5.
 */
@RestController
public class UserMsgProvider {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @RequestMapping(value = "/send", method = RequestMethod.GET)
    public String sendKafka(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("发送消息");
        try {
            for(Integer i=0; i<15; i++) {
                String message = i.toString();
                kafkaTemplate.send("kafkatest", message);
                System.out.println(message);
            }
            return "ResultCode.SUCCESS"+"发送kafka成功";
        } catch (Exception e) {
            return "ResultCode.EXCEPTION"+"发送kafka失败";
        }
    }
}
