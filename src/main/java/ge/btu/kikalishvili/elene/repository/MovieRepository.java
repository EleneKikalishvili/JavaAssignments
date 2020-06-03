package ge.btu.kikalishvili.elene.repository;

import ge.btu.kikalishvili.elene.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
public interface MovieRepository extends JpaRepository<Movie,Long> {
}
