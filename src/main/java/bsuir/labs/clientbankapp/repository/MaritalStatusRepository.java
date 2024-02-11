package bsuir.labs.clientbankapp.repository;

import bsuir.labs.clientbankapp.model.MaritalStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MaritalStatusRepository extends JpaRepository<MaritalStatus, Integer> {
    Optional<MaritalStatus> findByName(String name);
}
