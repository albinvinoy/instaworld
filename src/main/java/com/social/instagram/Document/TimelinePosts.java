package com.social.instagram.Document;

import java.time.Instant;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "timeline_posts")
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
@Builder
@Data
public class TimelinePosts {

  @Id private String postId;
  private List<Comments> comments;
  private Instant postTime;
  private String message;

  public static class Comments {
    private String userId;
    private Instant commentTime;
    private String message;
  }
}
