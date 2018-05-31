package com.potucek.seeds.service;

import com.potucek.seeds.Seed;

import java.util.Collection;
import java.util.Optional;

public interface SeedService {

    Collection<Seed> seeds();

    Optional<Seed> seed(Long id);

}
