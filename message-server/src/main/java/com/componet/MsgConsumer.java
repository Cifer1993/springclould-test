package com.componet;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/1/6.
 */
@Component
public class MsgConsumer {
    private int i = 0;

    @KafkaListener(topics = {"kafkatest"})
    public void listenmessage(ConsumerRecord<?, ?> cr){
        System.out.println("listenT1收到消息,topic:>>>" + cr.topic() + "  offset:>>" + cr.offset()+ "  key:>>" + cr.key() + "  value:>>" + cr.value());
        i++;
        System.out.println(i);
    }
}
