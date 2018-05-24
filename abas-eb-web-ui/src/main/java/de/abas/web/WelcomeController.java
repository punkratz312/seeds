package de.abas.web;

import de.abas.service.DataService;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Slf4j
@RequiredArgsConstructor
@Controller
@RequestMapping("web")
public class WelcomeController {

    @Autowired
    private final DataService.Factory factory;

    @GetMapping
    public String example(Map<String, Object> model) {
        String foo22 = factory.create("42").foo22();
        log.info("example request with foo22: '{}'", foo22);
        model.put("message", foo22);
        return "example";
    }
}