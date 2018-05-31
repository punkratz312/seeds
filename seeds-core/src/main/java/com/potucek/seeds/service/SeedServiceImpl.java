package com.potucek.seeds.service;

import com.potucek.seeds.Seed;
import com.potucek.seeds.SeedRepository;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Value
@Service
class SeedServiceImpl implements SeedService {

    @Autowired
    private SeedRepository seedRepository;

    @Override
    public Collection<Seed> seeds() {
        return seedRepository.findAll();
    }

    @Override
    public Optional<Seed> seed(Long id) {
        return seedRepository.findById(id);
    }
}
