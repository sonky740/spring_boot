package tobyspring.helloboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
  @GetMapping("/hello")
  public String hello(String name) {
    if (name == null || name.isEmpty()) {
      name = "World";
    }
    return "Hello " + name;
  }
}