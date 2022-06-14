package com.redalertlabs.persistantqueue.service;


import com.redalertlabs.persistantqueue.dto.PersistantQueueDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersistantQueueService {

    PersistantQueueDto enQueueEvent(PersistantQueueDto persistantQueueDto);

    String executeEvent(String eventName) throws InterruptedException;

    List<PersistantQueueDto> getAllEvents();
}
