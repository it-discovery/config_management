package spring.web;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@ConfigurationProperties("library")
@Component
@Getter
@Setter
public class LibraryConfiguration {
    private String name;

    private List<String> names;

    private Map<String, String> config;
}
