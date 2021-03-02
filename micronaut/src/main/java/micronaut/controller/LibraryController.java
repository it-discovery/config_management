package micronaut.controller;

import io.micronaut.context.annotation.Property;
import io.micronaut.context.annotation.Value;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/library")
public class LibraryController {

    //@Value("${library.name}")
    @Property(name = "library.name")
    private String libraryName;

    @Get(produces = MediaType.TEXT_PLAIN)
    public String index() {
        return libraryName;
    }
}