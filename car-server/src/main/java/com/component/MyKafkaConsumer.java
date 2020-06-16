package com.component;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyKafkaConsumer
 * @Description TODO
 * @Author Cifer
 * Date 2020/5/30 11:34 PM
 * Version 1.0
 **/
@Component
public class MyKafkaConsumer {

//    @KafkaListener(group = "testGroup", topicPartitions = {
//            @TopicPartition(topic = "topic1", partitions = {"0", "1"}),
//            @TopicPartition(topic = "topic2", partitions = "0",
//                    partitionOffsets = @PartitionOffset(partition = "1", initialOffset = "100"))
//    })
    @KafkaListener(topics="myReplicated",group = "myGroup")
    public void listen(ConsumerRecord<Object, String> record, Acknowledgment acknowledgment){
        String value = record.value();
        System.out.println(value);
        System.out.println(record);
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        acknowledgment.acknowledge();
    }
}
