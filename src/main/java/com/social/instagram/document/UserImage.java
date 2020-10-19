package com.social.instagram.document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.annotation.Id;

@Data
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserImage {
  @Id private String _id;
  private String userId;
  private String profilePictureLocation;
}
