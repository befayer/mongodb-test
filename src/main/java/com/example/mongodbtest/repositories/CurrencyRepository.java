package com.example.mongodbtest.repositories;

import com.example.mongodbtest.entities.Client;
import com.example.mongodbtest.entities.Currency;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface CurrencyRepository extends MongoRepository<Currency, UUID> {
}
