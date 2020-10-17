package com.social.instagram.Document;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class AccountUser {

  @Id private String userId;
  private String firstName;
  private String lastName;
  private String email;
  private List<String> timelinePostId;
}
