package com.sheilambadi.movieapi.service;

import com.sheilambadi.movieapi.model.MovieModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author sheilambadi
 */
public class MovieService {
    
    static HashMap<Integer, MovieModel> movies = getMovieHashMap();
    
    public MovieService(){
        
        if(movies == null){
            movies = new HashMap<Integer, MovieModel>();
            
            MovieModel avengers = new MovieModel(1, "Avengers: Infinity War", "Iron Man, Thor, the Hulk and the rest of the Avengers unite to battle their most powerful enemy yet -- the evil Thanos. On a mission to collect all six Infinity Stones, Thanos plans to use the artifacts to inflict his twisted will on reality. The fate of the planet and existence itself has never been more uncertain as everything the Avengers have fought for has led up to this moment.");
            MovieModel blackPanther = new MovieModel(2, "Black Panther", "After the death of his father, T'Challa returns home to the African nation of Wakanda to take his rightful place as king. When a powerful enemy suddenly reappears, T'Challa's mettle as king -- and as Black Panther -- gets tested when he's drawn into a conflict that puts the fate of Wakanda and the entire world at risk. Faced with treachery and danger, the young king must rally his allies and release the full power of Black Panther to defeat his foes and secure the safety of his people.");
            MovieModel hereditary = new MovieModel(3, "Hereditary", "When the matriarch of the Graham family passes away, her daughter and grandchildren begin to unravel cryptic and increasingly terrifying secrets about their ancestry, trying to outrun the sinister fate they have inherited.");
            
            movies.put(1, avengers);
            movies.put(2, blackPanther);
            movies.put(3, hereditary);
        
        }    
    }
    
    public List getMovies(){   
        List movieList = new ArrayList(movies.values());
        return  movieList;
    }
    
    public MovieModel getSpecificMovie(int id){
        MovieModel specificMovie = movies.get(id);
        return specificMovie;
    }
    
    public MovieModel setMovieModel(MovieModel movieModel){
        movieModel.setMovieId(movies.size()+1);
        movies.put(movieModel.getMovieId(), movieModel);
        return  movieModel;
    }
    
    public MovieModel updateMovieModel(MovieModel movieModel){
        int id = movieModel.getMovieId();
        movies.put(id, movieModel);
        return movieModel;
    }
    

    
    public static HashMap<Integer, MovieModel> getMovieHashMap(){
        return movies;
    }
    
}
