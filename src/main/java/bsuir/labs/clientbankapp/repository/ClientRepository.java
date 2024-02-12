package bsuir.labs.clientbankapp.repository;

import bsuir.labs.clientbankapp.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClientRepository extends JpaRepository<Client, Integer> {

}
