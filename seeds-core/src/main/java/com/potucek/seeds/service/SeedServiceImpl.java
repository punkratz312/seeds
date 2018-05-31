package com.potucek.seeds.service;

import com.potucek.seeds.Seed;
import com.potucek.seeds.Seeds;
import lombok.Value;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@Value
@Service
class SeedServiceImpl implements SeedService {

    public Collection<Seeds> seeds() {
        return List.of(new Seeds(List.of("foo1"), List.of(new Seed(Map.of("foo1", System.currentTimeMillis())))));
    }

}
