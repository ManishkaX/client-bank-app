package bsuir.labs.clientbankapp.utils;

import bsuir.labs.clientbankapp.model.Sex;
import bsuir.labs.clientbankapp.service.SexService;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class SexFormatter implements Formatter<Sex> {
    private final SexService sexService;

    public SexFormatter(SexService sexService) {
        this.sexService = sexService;
    }

    @Override
    public Sex parse(String text, Locale locale) {
        return sexService.getSexByName(text).orElse(null);
    }

    @Override
    public String print(Sex sex, Locale locale) {
        return sex.getName();
    }
}
