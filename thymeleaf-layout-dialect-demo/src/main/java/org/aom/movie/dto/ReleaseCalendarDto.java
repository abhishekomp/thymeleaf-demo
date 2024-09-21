package org.aom.movie.dto;

import java.time.LocalDate;

/**
 * @author : abhishek
 * @since : Sun, 2024-Sep-22
 * Created with IntelliJ IDEA
 */
public class ReleaseCalendarDto {

    private Long id;
    private String movieName;
    private LocalDate releaseDate;

    public ReleaseCalendarDto() {
    }

    public ReleaseCalendarDto(Long id, String movieName, LocalDate releaseDate) {
        this.id = id;
        this.movieName = movieName;
        this.releaseDate = releaseDate;
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

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "ReleaseCalendar{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
