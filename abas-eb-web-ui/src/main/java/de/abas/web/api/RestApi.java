package de.abas.web.api;

import de.abas.service.DataService;
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
    private final DataService dataService;

    @GetMapping
    public Collection<DataService.Item> example() {
        return dataService.items();
    }

}