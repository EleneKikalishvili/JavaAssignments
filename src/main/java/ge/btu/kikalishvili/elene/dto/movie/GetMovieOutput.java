package ge.btu.kikalishvili.elene.dto.movie;

import lombok.Data;

import java.util.List;

@Data
public class GetMovieOutput {
    private List<MovieDTO> movies;
}
