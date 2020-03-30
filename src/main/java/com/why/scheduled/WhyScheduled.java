package com.why.scheduled;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Slf4j
@Component
public class WhyScheduled {
    @Async
    @Scheduled(cron = "0/10 * *  * * ? ")
    public void sayHello() {
        try {
            log.info("Task1---------{}------------{}", Thread.currentThread().getName(), LocalDateTime.now().toString());
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
