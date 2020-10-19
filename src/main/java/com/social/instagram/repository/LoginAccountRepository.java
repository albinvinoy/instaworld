package com.social.instagram.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginAccountRepository
    extends ReactiveMongoRepository<LoginAccountRepository, String> {}
