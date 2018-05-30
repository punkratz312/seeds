package de.abas.service;

import lombok.Value;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@Value
class DataServiceImpl implements DataService {

    String criteria;

    public Collection<Item> items() {
        return List.of(
                new Item(Map.of(
                        "foo", criteria + " - " + System.currentTimeMillis(),
                        "bar", criteria + " - " + System.currentTimeMillis(),
                        "baz", criteria + " - " + System.currentTimeMillis())),
                new Item(Map.of(
                        "foo", criteria + " - " + System.currentTimeMillis(),
                        "bar", criteria + " - " + System.currentTimeMillis(),
                        "baz", criteria + " - " + System.currentTimeMillis())),
                new Item(Map.of(
                        "foo", criteria + " - " + System.currentTimeMillis(),
                        "bar", criteria + " - " + System.currentTimeMillis(),
                        "baz", criteria + " - " + System.currentTimeMillis())),
                new Item(Map.of(
                        "foo", criteria + " - " + System.currentTimeMillis(),
                        "bar", criteria + " - " + System.currentTimeMillis(),
                        "baz", criteria + " - " + System.currentTimeMillis())),
                new Item(Map.of(
                        "foo", criteria + " - " + System.currentTimeMillis(),
                        "bar", criteria + " - " + System.currentTimeMillis(),
                        "baz", criteria + " - " + System.currentTimeMillis())));
    }

}
