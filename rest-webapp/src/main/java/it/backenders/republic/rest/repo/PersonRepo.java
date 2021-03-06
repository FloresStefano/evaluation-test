package it.backenders.republic.rest.repo;

import it.backenders.republic.rest.entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface PersonRepo extends CrudRepository<Person, Long> {
    @RestResource(path = "byName")
    public List<Person> findByPersonName(@Param("name") String personName);
}
