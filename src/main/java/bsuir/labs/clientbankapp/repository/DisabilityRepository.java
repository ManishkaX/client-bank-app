package bsuir.labs.clientbankapp.repository;

import bsuir.labs.clientbankapp.model.Disability;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DisabilityRepository extends JpaRepository<Disability, Integer> {
    Optional<Disability> findByName(String name);
}
