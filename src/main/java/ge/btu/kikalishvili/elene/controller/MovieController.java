package ge.btu.kikalishvili.elene.controller;

import ge.btu.kikalishvili.elene.dto.movie.*;
import ge.btu.kikalishvili.elene.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/MovieController")
public class MovieController {
    @Autowired
    MovieService movieService;

    @PostMapping("getMovies")
    public GetMovieOutput getMovies(@RequestBody GetMovieInput getMovieInput) {
        return movieService.getMovies(getMovieInput);
    }

    @PostMapping("addMovie")
    public AddMovieOutput addMovie(@RequestBody AddMovieInput addMovieInput) {
        return movieService.addMovie(addMovieInput);
    }

    @PostMapping("deleteMovie")
    public DeleteMovieOutput deleteMovie(@RequestBody DeleteMovieInput deleteMovieInput) {
        return movieService.deleteMovie(deleteMovieInput);
    }

    @PostMapping("getOneMovie")
    public GetOneMovieOutput getMovie(@RequestBody GetOneMovieInput getOneMovieInput) {
        return movieService.getMovie(getOneMovieInput);
    }
}
