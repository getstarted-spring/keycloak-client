package io.getstarted.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessagingRestService {

  @GetMapping(path = "/user/message")
  public String getUserMessage() {
    return "Hello, User";
  }

  @GetMapping(path = "/admin/message")
  public String getAdminMessage() {
    return "Hello, Administrator";
  }
}
