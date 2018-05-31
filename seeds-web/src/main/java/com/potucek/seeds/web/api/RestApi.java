package com.potucek.seeds.web.api;

import com.potucek.seeds.Seeds;
import com.potucek.seeds.service.SeedService;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@Value
@RestController
@RequestMapping("api")
public class RestApi {

    @Autowired
    private final SeedService seedService;

    @GetMapping
    public Collection<Seeds> example() {
        return seedService.seeds();
    }

}