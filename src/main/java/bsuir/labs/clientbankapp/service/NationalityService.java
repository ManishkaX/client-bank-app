package bsuir.labs.clientbankapp.service;

import bsuir.labs.clientbankapp.model.Disability;
import bsuir.labs.clientbankapp.model.Nationality;
import bsuir.labs.clientbankapp.repository.NationalityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NationalityService {
    private final NationalityRepository nationalityRepository;

    @Autowired
    public NationalityService(NationalityRepository nationalityRepository) {
        this.nationalityRepository = nationalityRepository;
    }

    public List<Nationality> getAll() {
        return nationalityRepository.findAll();
    }

    public Optional<Nationality> getNationalityByName(String name) {
        return nationalityRepository.findByName(name);
    }

    public void addNationality(String name) {
        var nationality = new Nationality(name);
        nationalityRepository.save(nationality);
    }
}
