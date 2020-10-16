package com.social.instagram.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

  @Id private String userId;
}
