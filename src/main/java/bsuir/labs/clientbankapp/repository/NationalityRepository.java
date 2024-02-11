package bsuir.labs.clientbankapp.repository;

import bsuir.labs.clientbankapp.model.Nationality;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NationalityRepository extends JpaRepository<Nationality, Integer> {
    Optional<Nationality> findByName(String name);
}
