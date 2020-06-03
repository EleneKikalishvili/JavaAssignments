package ge.btu.kikalishvili.elene.service.impl;

import ge.btu.kikalishvili.elene.dto.movie.*;
import ge.btu.kikalishvili.elene.model.Movie;
import ge.btu.kikalishvili.elene.repository.MovieRepository;
import ge.btu.kikalishvili.elene.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    MovieRepository movieRepository;

    @Override
    public GetMovieOutput getMovies(GetMovieInput getMovieInput) {
        List<MovieDTO> movieDTOList = new ArrayList<>();
        for (Movie movie : movieRepository.findAll()) {
            MovieDTO movieDTO = new MovieDTO();
            movieDTO.setId(movie.getId());
            movieDTO.setTitle(movie.getTitle());
            movieDTO.setCountry(movie.getCountry());
            movieDTOList.add(movieDTO);
        }

        GetMovieOutput getMovieOutput = new GetMovieOutput();
        getMovieOutput.setMovies(movieDTOList);
        return getMovieOutput;
    }

    @Override
    public AddMovieOutput addMovie(AddMovieInput addMovieInput) {
        Movie movie = new Movie();
        movie.setTitle(addMovieInput.getTitle());
        movie.setCountry(addMovieInput.getCountry());

        movieRepository.save(movie);

        AddMovieOutput addMovieOutput = new AddMovieOutput();
        addMovieOutput.setMsg("Movie Added");
        return addMovieOutput;
    }

    @Override
    public DeleteMovieOutput deleteMovie(DeleteMovieInput deleteMovieInput) {
        Movie movie = movieRepository.getOne(deleteMovieInput.getMovieId());
        movieRepository.delete(movie);

        DeleteMovieOutput deletePostOutput = new DeleteMovieOutput();
        deletePostOutput.setMsg("Movie Deleted");
        return deletePostOutput;
    }

    @Override
    public GetOneMovieOutput getMovie(GetOneMovieInput getOneMovieInput) {
        Movie movie = movieRepository.getOne(getOneMovieInput.getMovieId());

        GetOneMovieOutput getOneMovieOutput = new GetOneMovieOutput();
        getOneMovieOutput.setTitle(movie.getTitle());
        getOneMovieOutput.setCountry(movie.getCountry());

        return getOneMovieOutput;
    }
}