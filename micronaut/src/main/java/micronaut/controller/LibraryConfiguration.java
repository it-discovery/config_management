package micronaut.controller;

import io.micronaut.context.annotation.ConfigurationProperties;
import lombok.Getter;
import lombok.Setter;

@ConfigurationProperties("library")
@Getter
@Setter
public class LibraryConfiguration {
    private String name;
}
