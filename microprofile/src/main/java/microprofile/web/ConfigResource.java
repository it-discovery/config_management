package microprofile.web;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/library")
@ApplicationScoped
public class ConfigResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String libraryName() {
        return "IT-Discovery";
    }
}