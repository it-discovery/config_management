package bootstrap;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Bootstrap {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();

        try(InputStream in = Bootstrap.class.getClassLoader().getResourceAsStream("application.properties")) {
            properties.load(in);
            System.out.println("Library name is " + properties.getProperty("library.name", "N/A"));
        }
    }
}
