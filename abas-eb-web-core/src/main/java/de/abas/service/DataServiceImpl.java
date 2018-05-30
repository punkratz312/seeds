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
                        "foo1", criteria + " - " + System.currentTimeMillis(),
                        "foo2", criteria,
                        "foo3", criteria,
                        "foo4", criteria,
                        "foo5", criteria,
                        "foo6", criteria,
                        "foo7", criteria + " - " + System.currentTimeMillis())),
                new Item(Map.of(
                        "foo1", criteria + " - " + System.currentTimeMillis(),
                        "foo2", criteria,
                        "foo3", criteria,
                        "foo4", criteria,
                        "foo5", criteria,
                        "foo6", criteria,
                        "foo7", criteria + " - " + System.currentTimeMillis())),
                new Item(Map.of(
                        "foo1", criteria + " - " + System.currentTimeMillis(),
                        "foo2", criteria,
                        "foo3", criteria,
                        "foo4", criteria,
                        "foo5", criteria,
                        "foo6", criteria,
                        "foo7", criteria + " - " + System.currentTimeMillis())),
                new Item(Map.of(
                        "foo1", criteria + " - " + System.currentTimeMillis(),
                        "foo2", criteria,
                        "foo3", criteria,
                        "foo4", criteria,
                        "foo5", criteria,
                        "foo6", criteria,
                        "foo7", criteria + " - " + System.currentTimeMillis())),
                new Item(Map.of(
                        "foo1", criteria + " - " + System.currentTimeMillis(),
                        "foo2", criteria,
                        "foo3", criteria,
                        "foo4", criteria,
                        "foo5", criteria,
                        "foo6", criteria,
                        "foo7", criteria + " - " + System.currentTimeMillis())));
    }

}
