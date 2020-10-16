package com.social.instagram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class InstagramApplication {

  public static void main(String[] args) {
    SpringApplication.run(InstagramApplication.class, args);
  }
}
