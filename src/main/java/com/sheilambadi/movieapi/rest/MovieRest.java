package com.sheilambadi.movieapi.rest;

import com.sheilambadi.movieapi.service.MovieService;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author sheilambadi
 */
@Path("/movies")
public class MovieRest {
    MovieService movieService = new MovieService();
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List getMovies(){
        List listOfMovies = movieService.getMovies();
        return  listOfMovies;
    }
    
}
