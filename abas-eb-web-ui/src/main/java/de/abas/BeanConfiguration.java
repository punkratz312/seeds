package de.abas;

import de.abas.service.DataService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@RequiredArgsConstructor
@Configuration
public class BeanConfiguration {

    @Autowired
    private final DataService.Factory factory;

    @Bean
    public DataService helloWorld() {
        return factory.create("42");
    }
}