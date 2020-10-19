package com.social.instagram.controller;

import com.mongodb.MongoException;
import com.social.instagram.api.Endpoints;
import com.social.instagram.api.TimelineResponse;
import com.social.instagram.document.ProfileAccount;
import com.social.instagram.repository.ProfileAccountRepository;
import com.social.instagram.service.ProfilePictureService;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping(Endpoints.baseUrl)
public class InstagramController {

  @Autowired private final ProfileAccountRepository profileAccountRepository;
  @Autowired private final ProfilePictureService profilePictureService;

  @PostMapping(Endpoints.newPost)
  public Mono<TimelineResponse<String>> saveOriginalPost(
      @RequestHeader(value = "postOwnerId") String ownerId, @RequestBody String post) {
    return Mono.empty();
  }

  // create a new account
  @PostMapping(Endpoints.newAccount)
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
  @GetMapping(
      consumes = MediaType.MULTIPART_FORM_DATA_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE,
      path = Endpoints.uploadProfilePicture)
  public void uploadProfilePicture(
      @PathVariable(value = "userId") String userId,
      @RequestParam(value = "file") MultipartFile file) {
    log.info(String.valueOf(file));
    profilePictureService.uploadUserProfilePicture(userId, file);
  }
}
