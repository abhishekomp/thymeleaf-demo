package org.aom.movie;

import org.aom.movie.dto.MovieDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

/**
 * @author : abhishek
 * @since : Sat, 2024-Sep-21
 * Created with IntelliJ IDEA
 */
@Repository
class MovieRepository {

    private static final Logger log = LoggerFactory.getLogger(MovieRepository.class);

    List<MovieDto> getMovies() {
        MovieDto movie1 = new MovieDto(1001L, "Hush", LocalDate.of(2020, 8, 20), 9);
        MovieDto movie2 = new MovieDto(1002L, "Hachhiko", LocalDate.of(2021, 10, 20), 9);
        MovieDto movie3 = new MovieDto(1003L, "The Tank", LocalDate.of(2024, 9, 21), 7);
        MovieDto movie4 = new MovieDto(1004L, "Jaane bhi do yaaron", LocalDate.of(2024, 9, 18), 7);
        List<MovieDto> list = List.of(movie1, movie2, movie3, movie4);
        log.info("Returning {} movies", list.size());
        return list;
    }
}
