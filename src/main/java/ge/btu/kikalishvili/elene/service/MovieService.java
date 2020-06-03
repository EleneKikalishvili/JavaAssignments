package ge.btu.kikalishvili.elene.service;

import ge.btu.kikalishvili.elene.dto.movie.*;

public interface MovieService {

    GetMovieOutput getMovies(GetMovieInput getMovieInput);

    AddMovieOutput addMovie(AddMovieInput addMovieInput);

    DeleteMovieOutput deleteMovie(DeleteMovieInput deleteMovieInput);

    GetOneMovieOutput getMovie(GetOneMovieInput getOneMovieInput);
}
