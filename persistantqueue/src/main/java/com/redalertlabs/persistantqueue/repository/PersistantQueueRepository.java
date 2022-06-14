package com.redalertlabs.persistantqueue.repository;

import com.redalertlabs.persistantqueue.model.PersistantQueue;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersistantQueueRepository extends CrudRepository<PersistantQueue,String> {

    PersistantQueue findByEventName(String eventName);
}
