package com.social.instagram.Document;

import java.io.Serializable;
import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "friend_connection")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
@Builder
public class Friends {

  @Id private FriendConnection connectionId;
  private Instant dateOfFriendship;

  @Data
  @NoArgsConstructor
  @AllArgsConstructor
  @Slf4j
  @Builder
  private static class FriendConnection implements Serializable {

    private String friendId;
    private String userId;
  }
}
