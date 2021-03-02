package spring.web;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("library")
@Component
@Getter
@Setter
public class LibraryConfiguration {
    private String name;
}
