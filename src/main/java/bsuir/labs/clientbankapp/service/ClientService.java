package bsuir.labs.clientbankapp.service;

import bsuir.labs.clientbankapp.model.Client;
import bsuir.labs.clientbankapp.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> getAll() {
        return clientRepository.findAll(Sort.by(Sort.DEFAULT_DIRECTION, "surname"));
    }
    public void saveClient(Client client) {
        clientRepository.save(client);
    }

    public Optional<Client> getById(int id) {
        return clientRepository.findById(id);
    }

    public void updateClient(Client client, int id) {
        client.setId(id);
        clientRepository.save(client);
    }

}
