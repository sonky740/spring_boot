package tobyspring.helloboot;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class HelloControllerTest {
  HelloService helloService = name -> "Hello " + name;

  @Test
  void helloController() {
    HelloController helloController = new HelloController(helloService);

    String ret = helloController.hello("Test");
    assertThat(ret).isEqualTo("Hello Test");
  }

  @Test
  void failsHelloController() {
    HelloController helloController = new HelloController(helloService);

    assertThatThrownBy(() -> helloController.hello(null))
        .isInstanceOf(IllegalArgumentException.class);

    assertThatThrownBy(() -> helloController.hello(""))
        .isInstanceOf(IllegalArgumentException.class);
  }
}
