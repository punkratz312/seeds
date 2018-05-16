package de.abas.service;

import org.springframework.stereotype.Service;

@Service
public class DataServiceImpl implements DataService {
    public String foo22() {
        return "foo22" + System.currentTimeMillis();
    }
}
