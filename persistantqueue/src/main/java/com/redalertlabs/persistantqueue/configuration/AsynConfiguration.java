package com.redalertlabs.persistantqueue.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import javax.annotation.PreDestroy;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
@Configuration
@EnableAsync
public class AsynConfiguration implements AsyncConfigurer {
    private ThreadPoolTaskExecutor executor;
    @Override
    public Executor getAsyncExecutor() {
        executor=new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(20);
        executor.setMaxPoolSize(50);
        executor.setQueueCapacity(10);
        executor.initialize();
        return executor;

    }
    @PreDestroy
    public void shutdownExecutors(){
        executor.shutdown();
    }
}
