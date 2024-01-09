package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jdk.jfr.Description;
import org.acme.Models.Movie;

import java.util.List;


@Path("/movies")
public class MovieResource {
    @GET()
    @Path("list")
    @Description("get list of movies")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getListMovies() {
        Movie movie = new Movie();
        List<Movie> response = movie.getList();
        return Response.ok(response).build();
    }
    @GET()
    @Path("{id}")
    @Description("get list of movies")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getMoviesbyId(@PathParam("id") Long id) {
        Movie movie = new Movie();
        Movie response = movie.getMovieById(id);
        return Response.ok(response).build();
    }
}
