package quarkus;

import io.quarkus.arc.config.ConfigProperties;
import lombok.Getter;
import lombok.Setter;

@ConfigProperties(prefix = "library")
public interface LibraryConfiguration {
    String name();
}
