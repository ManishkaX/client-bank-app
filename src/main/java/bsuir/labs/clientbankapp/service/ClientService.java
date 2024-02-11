package bsuir.labs.clientbankapp.service;

import bsuir.labs.clientbankapp.model.Client;
import bsuir.labs.clientbankapp.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }


}
