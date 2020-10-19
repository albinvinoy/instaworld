package com.social.instagram.repository;

import com.social.instagram.document.Friends;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendsRepository extends ReactiveMongoRepository<Friends, String> {}
