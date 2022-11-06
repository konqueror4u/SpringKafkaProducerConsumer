package com.visu.springkafkaproducerconsumer.consumer;

import com.visu.springkafkaproducerconsumer.common.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.listener.ConsumerSeekAware;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    private final Logger logger = LoggerFactory.getLogger(KafkaConsumerService.class);

    @KafkaListener(topics = AppConstants.TOPIC_NAME,
            groupId = AppConstants.GROUP_ID)
    public void consume(String message)
    {
        logger.info(String.format("Message recieved -> %s", message));
    }
}
