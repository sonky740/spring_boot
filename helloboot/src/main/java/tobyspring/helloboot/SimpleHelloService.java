package tobyspring.helloboot;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class SimpleHelloService implements HelloService {
  public String sayHello(String name) {
    if (name == null || name.isEmpty()) {
      name = "World";
    }
    return "Hello " + name;
  }
}
