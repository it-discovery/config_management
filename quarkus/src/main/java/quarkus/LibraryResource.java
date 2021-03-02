package quarkus;

import org.eclipse.microprofile.config.Config;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/library")
public class LibraryResource {

//    @ConfigProperty(name = "library.name")
//    private String libraryName;

    @Inject
    private Config config;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String libraryName() {
        return config.getValue("library.name", String.class);
    }
}