package de.abas.service;

import org.springframework.stereotype.Component;

public interface DataService {

    String foo22();

    @Component
    class Factory {

        public DataService create(String criteria) {
            return new DataServiceImpl(criteria);
        }
    }

}
