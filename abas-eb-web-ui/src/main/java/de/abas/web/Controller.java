package de.abas.web;

import de.abas.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("foo")
public class Controller {

    @Autowired
    private DataService dataService;

    @GetMapping("bar")
    public String foo() {
        return dataService.foo22();
    }

}
