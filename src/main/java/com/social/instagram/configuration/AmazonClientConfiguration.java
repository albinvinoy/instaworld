package com.social.instagram.configuration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AmazonClientConfiguration {

  @Value("${amazon.accessKey}")
  private String amazonAccessKey;

  @Value("${amazon.secretKey}")
  private String amazonSecretKey;

  @Value("${amazon.bucket.profilePicture}")
  private String profilePictureBucket;
}
