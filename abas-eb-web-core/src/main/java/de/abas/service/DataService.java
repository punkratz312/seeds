package de.abas.service;

import lombok.Value;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Map;

public interface DataService {

    Collection<Item> items();

    @Value
    class Item {

        Map<String, Object> properties;

        public Object getProperty(String key) {
            return properties.get(key);
        }
    }

    @Component
    class Factory {

        public DataService create(String criteria) {
            return new DataServiceImpl(criteria);
        }
    }
}
