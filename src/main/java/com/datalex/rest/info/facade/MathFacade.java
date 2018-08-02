package com.datalex.rest.info.facade;


import com.datalex.rest.info.model.MathDto;
import com.datalex.rest.info.service.MathService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class MathFacade {

    private static final Logger LOG = LoggerFactory.getLogger(MathFacade.class);

    @Autowired
    private KafkaTemplate<String, MathDto> kafkaTemplate;

    @Value("${app.topic.calculation}")
    private String topic;

    @Autowired
    MathService mathService;

    @Autowired
    CacheManager cacheManager;

    /**
     * created as a kind of database to store the calculation math result
     * the record gets inserted only when kafka topic is updated
     */
    private Cache mathCache;

    @PostConstruct
    private void init() {
        mathCache = cacheManager.getCache("math");
    }

    private static final AtomicInteger count = new AtomicInteger(0);

    public MathDto createMath(MathDto math)   {

        mathService.calculateResult(math);
        math.setId(count.get());
        send(math);
        return math;
    }

    public MathDto getMathBy(int id) {
        return mathCache.get(id, MathDto.class);
    }

    @KafkaListener(topics = "${app.topic.calculation}")
    private void updateRepository(@Payload String message) {
        LOG.info("received message='{}'", message);
        ObjectMapper mapper = new ObjectMapper();
        MathDto mathDto = null;
        try {
            mathDto = mapper.readValue(message, MathDto.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        mathCache.put(mathDto.getId(), mathDto);
        count.getAndIncrement();
    }

    private void send(MathDto message){
        LOG.info("sending message='{}' to topic='{}'", message, topic);
        kafkaTemplate.send(topic, message);
    }


}
