package de.abas.web;

import de.abas.service.DataService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@RequiredArgsConstructor
@Controller
@RequestMapping("web")
public class IndexController {

    @Autowired
    private final DataService.Factory factory;

    @GetMapping
    public String index(Map<String, Object> model) {
        String foo22 = factory.create("42").foo22();
        model.put("message", foo22);
        return "index";
    }
}