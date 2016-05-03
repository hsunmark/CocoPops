package View;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Henrik on 2016-05-02.
 */

@Path("/api")
public class RestResource {

    @GET
    @Path("/test")
    @Produces(MediaType.TEXT_PLAIN)
    public String getApplications() {

        return "test";
    }

}
