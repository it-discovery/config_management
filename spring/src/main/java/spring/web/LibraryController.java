package spring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class LibraryController {

//    @Value("${library.name:N/A}")
//    private String libraryName;

//    @Autowired
//    private Environment env;

    @Autowired
    private LibraryConfiguration libraryConfiguration;

    @GetMapping("library")
    public String libraryName() {
        return libraryConfiguration.getName();
    }
}
