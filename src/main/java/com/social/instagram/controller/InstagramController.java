package com.social.instagram.controller;

import com.mongodb.MongoException;
import com.social.instagram.api.Endpoints;
import com.social.instagram.api.TimelineResponse;
import com.social.instagram.document.ProfileAccount;
import com.social.instagram.repository.ProfileAccountRepository;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping(Endpoints.baseUrl)
public class InstagramController {

    @Autowired
    private final ProfileAccountRepository profileAccountRepository;

    @PostMapping(Endpoints.newPost)
    public Mono<TimelineResponse<String>> saveOriginalPost(
            @RequestHeader(value = "postOwnerId") String ownerId, @RequestBody String post) {
        return Mono.empty();
    }

    //create a new account
    @PostMapping( Endpoints.newAccount)
    public Boolean createNewUserAccount(
            @RequestHeader(value = "userName") String userName,
            @RequestHeader(value = "password") String password,
            @RequestHeader(value = "firstName") String firstName,
            @RequestHeader(value = "lastName") String lastName) {
        ProfileAccount profileAccount =
                ProfileAccount.builder()
                        .userId(UUID.randomUUID().toString())
                        .userName(userName)
                        .password(password)
                        .firstName(firstName)
                        .lastName(lastName)
                        .build();

        try {
            profileAccountRepository.save(profileAccount);
        } catch (MongoException e) {
            log.error("Failed to create a new Account", e);
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    // upload an image
    @GetMapping(Endpoints.uploadProfilePicture)
    public void uploadProfilePicture(){
        return;
    }

}
