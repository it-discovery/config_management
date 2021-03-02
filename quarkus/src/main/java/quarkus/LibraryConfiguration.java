package quarkus;

import io.quarkus.arc.config.ConfigProperties;
import lombok.Getter;
import lombok.Setter;

@ConfigProperties(prefix = "library")
@Getter
@Setter
public class LibraryConfiguration {
    private String name;
}
