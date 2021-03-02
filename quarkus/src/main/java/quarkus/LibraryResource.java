package quarkus;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/library")
public class LibraryResource {

    @ConfigProperty(name = "library.name")
    private String libraryName;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String libraryName() {
        return libraryName;
    }
}