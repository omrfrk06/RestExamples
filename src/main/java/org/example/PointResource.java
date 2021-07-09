package org.example;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;

@Path("points")
public class PointResource {

    PointRepository pointRepository = new PointRepository();

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Point> getPoints(){
        return pointRepository.getPoints();
    }

    @GET
    @Path("point/{id}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Point getPoint(@PathParam("id") int id){
        return pointRepository.getPoint(id);
    }

    @POST
    @Path("point")
    public Point createPoint(Point p1){
        System.out.println(p1);
        pointRepository.create(p1);

        return p1;
    }
}
