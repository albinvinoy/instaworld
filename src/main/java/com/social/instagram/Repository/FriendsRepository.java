package com.social.instagram.Repository;

import com.social.instagram.Document.Friends;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendsRepository extends ReactiveMongoRepository<Friends, String> {}
