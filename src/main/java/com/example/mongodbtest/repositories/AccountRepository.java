package com.example.mongodbtest.repositories;

import com.example.mongodbtest.entities.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<Account, String> {
}
