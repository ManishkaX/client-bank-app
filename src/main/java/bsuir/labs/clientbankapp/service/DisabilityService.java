package bsuir.labs.clientbankapp.service;

import bsuir.labs.clientbankapp.model.Disability;
import bsuir.labs.clientbankapp.repository.DisabilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DisabilityService {
    private final DisabilityRepository disabilityRepository;

    @Autowired
    public DisabilityService(DisabilityRepository disabilityRepository) {
        this.disabilityRepository = disabilityRepository;
    }

    public List<Disability> getAll() {
        return disabilityRepository.findAll();
    }

    public Optional<Disability> getDisabilityByName(String name) {
        return disabilityRepository.findByName(name);
    }

    public void addDisability(String name) {
        var disability = new Disability(name);
        disabilityRepository.save(disability);
    }
}
