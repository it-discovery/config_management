package bootstrap;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

public class Bootstrap {
    public static void main(String[] args) throws IOException {
//        System.getProperty("library.name");
//        System.getenv("library.name");
        Properties properties = new Properties();
        Path path = Path.of("jdk/src/main/resources/application.properties");

        try(InputStream in = Files.newInputStream(path)) {
            properties.load(in);
            System.out.println("Library name is " + properties.getProperty("library.name", "N/A"));
        }
    }
}
