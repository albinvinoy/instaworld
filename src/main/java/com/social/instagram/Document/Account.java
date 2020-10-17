package com.social.instagram.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "account_information")
@Data
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Account {

  @Id private String _id;
  private String passwordField;
  private String username;
}
