package tobyspring.config;

import org.springframework.core.type.AnnotationMetadata;
import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.lang.NonNull;

public class MyAutoConfigSelector implements DeferredImportSelector {
  @Override
  public @NonNull String[] selectImports(AnnotationMetadata importingClassMetadata) {
    return new String[] {
        "tobyspring.config.autoconfig.DispatcherServletConfig",
        "tobyspring.config.autoconfig.TomcatWebServerConfig"
    };
  }
}
