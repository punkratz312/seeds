package de.abas.web.api;

import de.abas.service.DataService;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Value
@Slf4j
@RestController
@RequestMapping("api")
public class RestApi {

    @Autowired
    private final DataService.Factory factory;

    @GetMapping
    public String example() {
        String foo22 = factory.create("42").foo22();
        log.info("example request with foo22: '{}'", foo22);
        return factory.create("42").foo22();
    }

}