package com.redalertlabs.persistantqueue.controller;

import com.redalertlabs.persistantqueue.dto.PersistantQueueDto;
import com.redalertlabs.persistantqueue.service.PersistantQueueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

@RestController
//@CrossOrigin(origins = "http://localhost:4200/*")
@CrossOrigin(origins = "http://localhost:4200")
public class PersistantQueueController {
    @Autowired
    private PersistantQueueService persistantQueueService;
    // @RequestMapping(value = "/enqueue-event",method = RequestMethod.POST)
    @PostMapping(value = "/enqueue-event", consumes = "application/json")
   public ResponseEntity<?> enQueueAnEvent(@RequestBody PersistantQueueDto persistantQueueDto) {
        System.out.println(persistantQueueDto.toString()+"====================================================");
        PersistantQueueDto persistantQueueDto1 = persistantQueueService.enQueueEvent(persistantQueueDto);


       return new ResponseEntity<PersistantQueueDto>(persistantQueueDto1,HttpStatus.CREATED);
   }
   @GetMapping("/execute-event/{eventName}")
   @Async
    public Future<?> executeEvent(@PathVariable String eventName ) throws InterruptedException {
        String response = persistantQueueService.executeEvent(eventName);

        return new AsyncResult<String>("Success");
   }

    @GetMapping("/events")
    public ResponseEntity<?> getsEvents() throws InterruptedException {
        List<PersistantQueueDto> events= persistantQueueService.getAllEvents();

        return new ResponseEntity<List<PersistantQueueDto>>(events,HttpStatus.OK);
    }

   /*
    @GetMapping("/execute-event/{eventName}")
    @Async
    public CompletableFuture<?> executeEvent(@PathVariable String eventName ) throws InterruptedException {
        String response = persistantQueueService.executeEvent(eventName);

        return CompletableFuture.supplyAsync(()->persistantQueueService.executeEvent(eventName));
    }*/
}
