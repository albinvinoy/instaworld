package com.social.instagram.Repository;

import com.social.instagram.Document.AccountUser;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountUserRepository extends ReactiveMongoRepository<AccountUser, String> {}
