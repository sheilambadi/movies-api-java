package com.sheilambadi.movieapi.model;

/**
 *
 * @author sheilambadi
 */
public class MovieModel {
    private int movieId;
    private String movieName;
    private String movieSynopsis;

    public MovieModel(int movieId, String movieName, String movieSynopsis) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieSynopsis = movieSynopsis;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieSynopsis() {
        return movieSynopsis;
    }

    public void setMovieSynopsis(String movieSynopsis) {
        this.movieSynopsis = movieSynopsis;
    }
    
}
