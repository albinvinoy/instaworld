package com.social.instagram.client;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.ObjectMetadata;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class StorageClient {

  private AmazonS3 s3;

  public void save(
      String path, // bucketName
      String fileName, // key
      Optional<Map<String, String>> metadata,
      InputStream inputStream) {

    ObjectMetadata objectMetadata = new ObjectMetadata();
    metadata.ifPresent(
        data -> {
          if (!data.isEmpty()) {
            data.forEach(objectMetadata::addUserMetadata);
          }
        });
    try {
      s3.putObject(path, fileName, inputStream, objectMetadata);
    } catch (AmazonServiceException e) {
      throw new IllegalStateException("Filed to store file to s3", e);
    }
  }

  public void stateException(Throwable throwable) {
    log.debug("Throwing Exception due to storage file not saved to s3");
    throw new IllegalStateException("Filed to store file to s3", throwable);
  }
}
