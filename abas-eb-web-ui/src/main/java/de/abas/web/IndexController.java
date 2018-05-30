package de.abas.web;

import de.abas.service.DataService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@RequiredArgsConstructor
@Controller
@RequestMapping("web")
public class IndexController {

    @Autowired
    private final DataService dataService;

    @Value("${item.properties}")
    private String[] properties;

    @GetMapping
    public String index(Map<String, Object> model) {
        model.put("properties", properties);
        model.put("items", dataService.items());
        return "index";
    }

}