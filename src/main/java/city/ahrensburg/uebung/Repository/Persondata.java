package city.ahrensburg.uebung.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import city.ahrensburg.uebung.model.Person;

public interface Persondata extends JpaRepository<Person, Long> {}
