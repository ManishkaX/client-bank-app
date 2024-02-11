package bsuir.labs.clientbankapp.repository;

import bsuir.labs.clientbankapp.model.Client;
import org.springframework.data.repository.CrudRepository;


public interface ClientRepository extends CrudRepository<Client, Integer> {

}
