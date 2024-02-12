package bsuir.labs.clientbankapp.utils;

import bsuir.labs.clientbankapp.model.Disability;
import bsuir.labs.clientbankapp.service.DisabilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class DisabilityFormatter implements Formatter<Disability> {
    private final DisabilityService disabilityService;

    @Autowired
    public DisabilityFormatter(DisabilityService disabilityService) {
        this.disabilityService = disabilityService;
    }

    @Override
    public Disability parse(String text, Locale locale) {
        return disabilityService.getDisabilityByName(text).orElse(null);
    }

    @Override
    public String print(Disability disability, Locale locale) {
        return disability.getName();
    }
}
