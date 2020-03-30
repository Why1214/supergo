package com.why.scheduled;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Slf4j
@Component
public class WhyScheduledTwo {
    @Async
    @Scheduled(cron = "0/5 * *  * * ? ")
    public void sayHello() {
        log.info("Task2---------{}------------{}", Thread.currentThread().getName(), LocalDateTime.now().toString());
    }
}
