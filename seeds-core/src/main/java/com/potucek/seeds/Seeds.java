package com.potucek.seeds;

import lombok.Value;

import java.util.List;

@Value
public class Seeds {

    List<String> properties;

    List<Seed> seeds;
}
