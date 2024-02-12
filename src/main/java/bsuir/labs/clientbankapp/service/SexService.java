package bsuir.labs.clientbankapp.service;

import bsuir.labs.clientbankapp.model.Nationality;
import bsuir.labs.clientbankapp.model.Sex;
import bsuir.labs.clientbankapp.repository.SexRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SexService {
    private final SexRepository sexRepository;

    @Autowired
    public SexService(SexRepository sexRepository) {
        this.sexRepository = sexRepository;
    }

    public List<Sex> getAll() {
        return sexRepository.findAll();
    }

    public Optional<Sex> getSexByName(String name) {
        return sexRepository.findByName(name);
    }

    public void addSex(String name) {
        sexRepository.save(new Sex(name));
    }
}
