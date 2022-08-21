package com.example.mongodbtest.repositories;

import com.example.mongodbtest.entities.Client;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface ClientRepository extends MongoRepository<Client, UUID> {
}
