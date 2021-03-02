package micronaut.controller;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/library")
public class LibraryController {

    @Get(produces = MediaType.TEXT_PLAIN)
    public String index() {
        return "IT-Discovery";
    }
}