package com.componet;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Created by Administrator on 2019/1/6.
 */
@Component
public class MsgConsumer {

    @Autowired
    private AsyncTask asyncTask;

    private int i = 0;

    @KafkaListener(topics = {"kafkatest"})
    public void listenmessage(ConsumerRecord<?, ?> cr,Acknowledgment ack) throws ExecutionException, InterruptedException {
        System.out.println("listenT1收到消息,topic:>>>" + cr.topic() + "  offset:>>" + cr.offset()+ "  key:>>" + cr.key() + "  value:>>" + cr.value());
        i++;
        Future<String> future = asyncTask.task();
        //手动提交offset
        ack.acknowledge();
        System.out.println(i);
    }
}
