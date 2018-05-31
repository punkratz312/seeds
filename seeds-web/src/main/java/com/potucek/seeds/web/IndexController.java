package com.potucek.seeds.web;

import com.potucek.seeds.service.SeedService;
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
    private final SeedService seedService;

    @GetMapping
    public String index(Map<String, Object> model) {
        model.put("seeds", seedService.seeds());
        return "index";
    }

}