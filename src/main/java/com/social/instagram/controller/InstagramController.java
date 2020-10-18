package com.social.instagram.controller;

import com.social.instagram.api.TimelineResponse;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
public class InstagramController {

  @PostMapping("/newPost")
  public Mono<TimelineResponse<String>> saveOriginalPost(
      @RequestHeader(value = "postOwnerId") String ownerId, @RequestBody String post) {
    return Mono.empty();
  }

  @GetMapping("/newPost")
  public Mono<TimelineResponse<String>> getPost(
      @PathVariable(value = "postId") String postId,
      @RequestHeader(value = "postOwnerId") String ownerId,
      @RequestBody String post) {

    return Mono.just(new TimelineResponse<>());
  }
}
