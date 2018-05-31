package com.potucek.seeds;

import lombok.Value;
import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.Map;

@Value
public class Seed {

    @Id
    Long id;

    List<String> properties;

    Map<String, Object> data;

    public Object get(String property) {
        return data.get(property);
    }
}
