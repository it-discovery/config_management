package spring.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class LibraryController {

    @GetMapping("library")
    public String libraryName() {
        return "IT-Discovery";
    }
}
