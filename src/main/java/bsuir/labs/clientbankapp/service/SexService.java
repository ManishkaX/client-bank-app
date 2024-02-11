package bsuir.labs.clientbankapp.service;

import bsuir.labs.clientbankapp.repository.SexRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SexService {
    private SexRepository sexRepository;

    @Autowired
    public SexService(SexRepository sexRepository) {
        this.sexRepository = sexRepository;
    }


}
