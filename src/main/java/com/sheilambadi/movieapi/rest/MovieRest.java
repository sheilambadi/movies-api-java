package com.sheilambadi.movieapi.rest;

import com.sheilambadi.movieapi.model.MovieModel;
import com.sheilambadi.movieapi.service.MovieService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public MovieModel getMovieById(@PathParam("id") int id){
        MovieModel movie = movieService.getSpecificMovie(id);
        return movie;
    }
    
    @POST
    @Path("addmovie")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public MovieModel setMovie(MovieModel movieModel){
        MovieModel movie = movieService.setMovieModel(movieModel);
        return movie;
    }
    
}
