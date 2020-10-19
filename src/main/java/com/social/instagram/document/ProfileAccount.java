package com.social.instagram.document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
@Builder
@Document(collection = "profile_information")
public class ProfileAccount {

  @Id private String userId;

  @Indexed(unique = true)
  private String userName;

  private String password;
  private String firstName;
  private String lastName;
  private String email;
}
