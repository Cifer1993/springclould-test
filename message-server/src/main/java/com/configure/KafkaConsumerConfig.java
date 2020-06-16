package com.configure;

import org.springframework.context.annotation.Configuration;


/**
 * Created by Administrator on 2019/1/6.
 */
@Configuration
//@EnableKafka
public class KafkaConsumerConfig {

//    @Value("${spring.cloud.kafka.bootstrap-servers}")
//    private String servers;
//    @Value("${spring.cloud.kafka.consumer.groupId}")
//    private String groupId;
//
//    @Bean
//    public KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String, String>> kafkaListenerContainerFactory() {
//        ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory<>();
//        factory.setConsumerFactory(consumerFactory());
//        factory.getContainerProperties().setPollTimeout(1500);
//        return factory;
//    }
//
//    public ConsumerFactory<String, String> consumerFactory() {
//        return new DefaultKafkaConsumerFactory<>(consumerConfigs());
//    }
//
//
//    public Map<String, Object> consumerConfigs() {
//        Map<String, Object> propsMap = new HashMap<>();
//        propsMap.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, servers);
//        propsMap.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG , "false");
//        propsMap.put(ConsumerConfig.GROUP_ID_CONFIG, groupId);
//        propsMap.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//        propsMap.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//        return propsMap;
//    }
//
//    @Bean
//    public KafkaProperties.Listener listener() {
//        return new KafkaProperties.Listener();
//    }
}
