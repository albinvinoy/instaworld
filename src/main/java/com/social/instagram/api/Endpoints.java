package com.social.instagram.api;

public interface Endpoints {

  String baseUrl = "/v1/api";
  String newAccount = "/new/account";
  String newPost = "/newPost";
  String uploadProfilePicture = "/upload/{userId}/profilePicture";
}
