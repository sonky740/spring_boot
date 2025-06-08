package tobyspring.config.autoconfig;

import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DispatcherServletConfig {
  @Bean
  public DispatcherServlet dispatcherServlet() {
    return new DispatcherServlet();
  }
}
