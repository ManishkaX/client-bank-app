package bsuir.labs.clientbankapp.utils;

import bsuir.labs.clientbankapp.model.Nationality;
import bsuir.labs.clientbankapp.service.NationalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class NationalityFormatter implements Formatter<Nationality> {
    private final NationalityService nationalityService;

    @Autowired
    public NationalityFormatter(NationalityService nationalityService) {
        this.nationalityService = nationalityService;
    }

    @Override
    public Nationality parse(String text, Locale locale) {
        return nationalityService.getNationalityByName(text).orElse(null);
    }

    @Override
    public String print(Nationality nationality, Locale locale) {
        return nationality.getName();
    }
}
