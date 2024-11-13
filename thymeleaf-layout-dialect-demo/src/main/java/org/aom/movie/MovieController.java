package org.aom.movie;

import org.aom.movie.dto.MovieDto;
import org.aom.movie.dto.ReleaseCalendarDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDate;
import java.util.List;

/**
 * @author : abhishek
 * @since : Sat, 2024-Sep-21
 * Created with IntelliJ IDEA
 */
@Controller
class MovieController {

    private static final Logger log = LoggerFactory.getLogger(MovieController.class);
    private final MovieRepository movieRepository;

    MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping
    String getMovies() {
        log.info("Redirecting to /posts endpoint");
        log.info("redirected to /movies");
        return "redirect:/movies";
    }

    @GetMapping("/movies")
    String getAllMovies(Model model){
        log.info("reached to /movies endpoint");
        List<MovieDto> movies = movieRepository.getMovies();
        model.addAttribute("movies", movies);
        return "index";
    }

    @GetMapping("/release-calendar")
    String getReleaseCalendar(Model model){
        log.info("reached to /release-calendar endpoint");
        ReleaseCalendarDto movie1 = new ReleaseCalendarDto(500L, "Titanic 2", LocalDate.of(2028, 4, 24));
        ReleaseCalendarDto movie2 = new ReleaseCalendarDto(500L, "Hush 2", LocalDate.of(2027, 6, 24));
        ReleaseCalendarDto movie3 = new ReleaseCalendarDto(500L, "The Fall Again", LocalDate.of(2026, 10, 30));
        List<ReleaseCalendarDto> movies = List.of(movie1, movie2, movie3);
        model.addAttribute("movies", movies);
        return "release_calendar";
    }

    @GetMapping("/popularMovies")
    String getPopularMovies(Model model){
        log.info("reached to /popularMovies endpoint");
        return "most_popular_movies";
    }

    @GetMapping("/movies/{movieId}")
    String getAllMovies(@PathVariable("movieId") long movieId, Model model){
        log.info("reached to /movies/{} endpoint", movieId);
        //MovieDto movie = movieRepository.findById(movieId);
        MovieDto movie = new MovieDto(9999L, "Unknown Movie", LocalDate.of(2099, 8, 20), 9);
        movie = movieRepository.getMovies().stream().filter(movieObj -> movieObj.getId() == movieId).findFirst().orElse(movie);
        model.addAttribute("movie", movie);
        return "movie-details";
    }
}
