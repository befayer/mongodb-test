package com.example.mongodbtest.repositories;

import com.example.mongodbtest.entities.Bank;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface BankRepository extends MongoRepository<Bank, String> {
    Optional<Bank> findBankByBankCity(String city);
}
