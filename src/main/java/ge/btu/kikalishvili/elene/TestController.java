package ge.btu.kikalishvili.elene;

import ge.btu.kikalishvili.elene.model.Movie;
import ge.btu.kikalishvili.elene.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    MovieRepository movieRepository;


    @GetMapping("addMovie")
    public void addMovie() {

        Movie movie = new Movie();
        movie.setTitle("Arrival");
        movie.setCountry("United States");


        movieRepository.save(movie);
    }

    @GetMapping("getMovies")
    public void getMovies() {
        for (Movie movie : movieRepository.findAll()) {
            System.out.println(movie);
        }
    }

    @GetMapping("getMovie")
    public void getMovie() {
        Movie movie = movieRepository.getOne(3L);
        System.out.println(movie.getTitle());
        System.out.println(movie.getCountry());
    }
}
