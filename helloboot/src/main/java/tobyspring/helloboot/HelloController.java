package tobyspring.helloboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
  private final HelloService helloService;

  public HelloController(HelloService helloService) {
    this.helloService = helloService;
  }

  @GetMapping("/hello")
  public String hello(@RequestParam("name") String name) {

    if (name == null || name.trim().length() == 0) {
      throw new IllegalArgumentException();
    }

    return helloService.sayHello(name);
  }
}