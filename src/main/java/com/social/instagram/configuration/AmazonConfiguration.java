package com.social.instagram.configuration;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class AmazonConfiguration {
  private AmazonClientConfiguration amazonClientConfiguration;

  public AmazonS3 s3() {
    AWSCredentials awsCredentials =
        new BasicAWSCredentials(
            amazonClientConfiguration.getAmazonAccessKey(),
            amazonClientConfiguration.getAmazonSecretKey());

    return AmazonS3ClientBuilder.standard()
        .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
        .build();
  }
}
