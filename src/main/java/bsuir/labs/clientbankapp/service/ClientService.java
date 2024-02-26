package bsuir.labs.clientbankapp.service;

import bsuir.labs.clientbankapp.model.Client;
import bsuir.labs.clientbankapp.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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

    public List<String> validate(Client client) {
        var clients = clientRepository.findAll();

        List<String> errors = new ArrayList<>();

        for (var currClient : clients) {
            if (Objects.equals(client.getFullName(), currClient.getFullName()))
                errors.add("Такое ФИО уже занято");

            if (Objects.equals(client.getPassport(), currClient.getPassport()))
                errors.add("Такой паспорт уже занят");

            if (Objects.equals(client.getIdentificationNumber(), currClient.getIdentificationNumber()))
                errors.add("Такой идентификационный номер уже занят");
        }

        return errors;
    }

    public void deleteClient(int id) {
        clientRepository.deleteById(id);
    }
}
