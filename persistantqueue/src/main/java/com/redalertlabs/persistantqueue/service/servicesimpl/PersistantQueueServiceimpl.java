package com.redalertlabs.persistantqueue.service.servicesimpl;

import com.redalertlabs.persistantqueue.dto.PersistantQueueDto;
import com.redalertlabs.persistantqueue.model.PersistantQueue;
import com.redalertlabs.persistantqueue.repository.PersistantQueueRepository;
import com.redalertlabs.persistantqueue.service.PersistantQueueService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
public class PersistantQueueServiceimpl implements PersistantQueueService {
    @Autowired
private PersistantQueueRepository persistantQueueRepository;

    private final ModelMapper mapper=new ModelMapper();

    @Override
    public PersistantQueueDto enQueueEvent(PersistantQueueDto persistantQueueDto) {
        persistantQueueDto.setEventName(persistantQueueDto.getEventName().toLowerCase());
        persistantQueueDto.setStatus("Ready");
        PersistantQueue persistantQueue=mapper.map(persistantQueueDto,PersistantQueue.class);
        persistantQueue= persistantQueueRepository.save(persistantQueue);
        persistantQueueDto=mapper.map(persistantQueue,PersistantQueueDto.class);
        return persistantQueueDto;
    }

    @Override
    public String executeEvent(String eventName) throws InterruptedException {
        PersistantQueue persistantQueue = persistantQueueRepository.findByEventName(eventName);
        persistantQueue.setStartTime(new Date());
        persistantQueue.setEndTime(null);
        persistantQueue.setStatus("in-progress");
        persistantQueueRepository.save(persistantQueue);
        Thread.sleep(persistantQueue.getProcessCompletionTime()*60000);
        persistantQueue.setEndTime(new Date());
        persistantQueue.setStatus("Completed");
        persistantQueueRepository.save(persistantQueue);

        return "Success";
    }

    @Override
    public List<PersistantQueueDto> getAllEvents() {
        List<PersistantQueueDto> events = new ArrayList<PersistantQueueDto>();
        persistantQueueRepository.findAll().forEach(event-> events.add(mapper.map(event,PersistantQueueDto.class)));

        return events;
    }
}
