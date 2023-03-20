package org.acme;

import org.acme.modul.AiRepo;

import javax.inject.Inject;
import javax.print.attribute.standard.Media;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api/ai")
public class AiResource {
    @Inject
    AiRepo aiRepo;

    @GET
    @Path("randomJoke")
    @Produces(MediaType.TEXT_PLAIN)
    public Response randomAiJoke() {
        return Response.ok(this.aiRepo.getRandomAiJoke()).build();
    }
}