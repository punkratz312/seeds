package de.abas.web;

import de.abas.service.DataService;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Controller
@RequestMapping("web")
public class IndexController {

    @Autowired
    private final DataService.Factory factory;

    @GetMapping
    public String index(Map<String, Object> model) {
        model.put("properties", List.of("foo", "bar", "baz", "article"));
        model.put("items", List.of(new Item(Map.of("foo", "bar"))));
        model.put("foo22", factory.create("42").foo22());
        return "index";
    }

    @Value
    private class Item {

        Map<String, Object> properties;

        public Object getProperty(String key) {
            return properties.get(key);
        }
    }
}