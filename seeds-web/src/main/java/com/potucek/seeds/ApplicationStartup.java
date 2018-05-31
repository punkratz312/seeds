package com.potucek.seeds;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@Component
public class ApplicationStartup implements ApplicationListener<ApplicationReadyEvent> {

    @Autowired
    private SeedRepository seedRepository;

    @Override
    public void onApplicationEvent(final ApplicationReadyEvent event) {
        //seedRepository.deleteAll();
        seedRepository.save(new Seed(
                System.currentTimeMillis(),
                List.of("foo", "bar", "baz"),
                Map.of("foo", UUID.randomUUID(), "bar", UUID.randomUUID(), "baz", UUID.randomUUID())));
    }

}