package bsuir.labs.clientbankapp.utils;

import bsuir.labs.clientbankapp.model.MaritalStatus;
import bsuir.labs.clientbankapp.service.MaritalStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class MaritalStatusFormatter implements Formatter<MaritalStatus> {
    private final MaritalStatusService maritalStatusService;

    @Autowired
    public MaritalStatusFormatter(MaritalStatusService maritalStatusService) {
        this.maritalStatusService = maritalStatusService;
    }

    @Override
    public MaritalStatus parse(String text, Locale locale) {
        return maritalStatusService.getMaritalStatusByName(text).orElse(null);
    }

    @Override
    public String print(MaritalStatus maritalStatus, Locale locale) {
        return maritalStatus.getName();
    }
}
