package com.potucek.seeds;

import lombok.Value;

import java.util.Map;

@Value
public class Seed {

    Map<String, Object> data;

    public Object get(String property) {
        return data.get(property);
    }
}
