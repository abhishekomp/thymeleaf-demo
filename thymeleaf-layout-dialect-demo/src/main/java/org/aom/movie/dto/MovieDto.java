package org.aom.movie.dto;

import java.time.LocalDate;

/**
 * @author : abhishek
 * @since : Sat, 2024-Sep-21
 * Created with IntelliJ IDEA
 */
public class MovieDto {

    private Long id;
    private String movieName;
    private LocalDate watchedOn;
    private Integer myRating;

    public MovieDto() {
    }

    public MovieDto(Long id, String movieName, LocalDate watchedOn, Integer myRating) {
        this.id = id;
        this.movieName = movieName;
        this.watchedOn = watchedOn;
        this.myRating = myRating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public LocalDate getWatchedOn() {
        return watchedOn;
    }

    public void setWatchedOn(LocalDate watchedOn) {
        this.watchedOn = watchedOn;
    }

    public Integer getMyRating() {
        return myRating;
    }

    public void setMyRating(Integer myRating) {
        this.myRating = myRating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                ", watchedOn=" + watchedOn +
                ", myRating=" + myRating +
                '}';
    }
}
