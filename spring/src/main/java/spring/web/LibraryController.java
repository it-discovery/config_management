package spring.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class LibraryController {

    @Value("${library.name}")
    private String libraryName;

    @GetMapping("library")
    public String libraryName() {
        return libraryName;
    }
}
