package com.social.instagram.controller;

import com.social.instagram.api.TimelineResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class InstagramController {

  @PostMapping("/newPost")
  public Mono<TimelineResponse<String>> saveOriginalPost(
      @RequestHeader(value = "postOwnerId") String ownerId,
      @RequestBody String post) {
    return Mono.empty();
  }
}
