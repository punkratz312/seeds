package com.potucek.seeds;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeedRepository extends MongoRepository<Seed, Long> {

}