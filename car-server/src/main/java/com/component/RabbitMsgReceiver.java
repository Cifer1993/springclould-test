package com.component;

//import org.springframework.amqp.*;
//import org.springframework.amqp.rabbit.annotation.RabbitHandler;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
//import org.springframework.amqp.support.AmqpHeaders;
/**
 * @ClassName RabbitMsgReceiver
 * @Description TODO
 * @Author Cifer
 * Date 2020/6/8 11:52 PM
 * Version 1.0
 **/
public class RabbitMsgReceiver {

//    @RabbitListener(queues = {"queue"})
//    @RabbitHandler
//    public void consumerMsg(Message message, Channel channel) throws IOException {
//        //手工签收
//        Long deliveryTag = (Long) message.getHeaders().get(AmqpHeaders.DELIVERY_TAG);
//        channel.basicAck(deliveryTag, false);
//    }
}
