package it.softlab.gsbatchprocessing.repository;

import it.softlab.gsbatchprocessing.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {
}
