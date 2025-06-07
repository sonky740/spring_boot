package tobyspring.helloboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.ApplicationContext;

import java.util.Objects;

@RestController
public class HelloController {
  private final HelloService helloService;
  private final ApplicationContext applicationContext;

  public HelloController(HelloService helloService, ApplicationContext applicationContext) {
    this.helloService = helloService;
    this.applicationContext = applicationContext;
  }

  @GetMapping("/hello")
  public String hello(@RequestParam("name") String name) {
    return helloService.sayHello(Objects.requireNonNull(name));
  }
}