package com.social.instagram.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.util.Objects;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TimelineResponse<T> {

  private HttpStatus status;
  private T payload;

  private void test(){
    Objects.equals("", "");
    "".equals("");
  }
}
