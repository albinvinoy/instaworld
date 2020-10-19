package com.social.instagram.repository;

import com.social.instagram.document.ProfileAccount;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileAccountRepository extends MongoRepository<ProfileAccount, String> {}
