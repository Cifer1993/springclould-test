package com.configure;

//import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName RabbitMqConfig
 * @Description TODO
 * @Author Cifer
 * Date 2020/6/8 11:50 PM
 * Version 1.0
 **/
public class RabbitMqConfig {
//    @Bean
//    public DirectExchange directExchange() {
//        DirectExchange directExchange = new DirectExchange("direct.exchange",true,false);
//        return directExchange;
//    }
//
//    @Bean
//    public CustomExchange delayExchange() {
//        Map<String, Object> args = new HashMap<String, Object>();
//        args.put("x-delayed-type", "direct");
//        return new CustomExchange("delayExchange", "x-delayed-message",true, false,args);
//    }
//
//    @Bean
//    public Queue queue() {
//        Queue queue = new Queue("queue",true,false,false);
//        return queue;
//    }
//
//    @Bean
//    public Queue clusterQueue() {
//        Queue queue = new Queue("clusterQueue",true,false,false);
//        return queue;
//    }
//
//    @Bean
//    public Queue delayQueue() {
//        Queue queue = new Queue("delayQueue",true,false,false);
//        return queue;
//    }
//
//    @Bean
//    public Binding binder() {
//        return BindingBuilder.bind(queue()).to(directExchange()).with("springboot.key");
//    }
//
//    @Bean
//    public Binding clusterBinder() {
//        return BindingBuilder.bind(clusterQueue()).to(directExchange()).with("rabbitmq.cluster.key");
//    }
//
//    @Bean
//    public Binding binding() {
//        return BindingBuilder.bind(delayQueue()).to(delayExchange()).with("springboot.delay.key").noargs();
//    }
}
