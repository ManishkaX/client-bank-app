package bsuir.labs.clientbankapp.service;

import bsuir.labs.clientbankapp.model.Disability;
import bsuir.labs.clientbankapp.model.MaritalStatus;
import bsuir.labs.clientbankapp.repository.MaritalStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MaritalStatusService {
    private final MaritalStatusRepository maritalStatusRepository;

    @Autowired
    public MaritalStatusService(MaritalStatusRepository maritalStatusRepository) {
        this.maritalStatusRepository = maritalStatusRepository;
    }

    public List<MaritalStatus> getAll() {
        return maritalStatusRepository.findAll();
    }

    public Optional<MaritalStatus> getMaritalStatusByName(String name) {
        return maritalStatusRepository.findByName(name);
    }

    public void addMaritalStatus(String name) {
        var maritalStatus = new MaritalStatus(name);
        maritalStatusRepository.save(maritalStatus);
    }
}
