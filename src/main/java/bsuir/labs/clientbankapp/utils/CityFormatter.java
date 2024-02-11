package bsuir.labs.clientbankapp.utils;

import bsuir.labs.clientbankapp.model.City;
import bsuir.labs.clientbankapp.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

@Component
public class CityFormatter implements Formatter<City> {

    private CityService cityService;

    @Autowired
    public CityFormatter(CityService cityService) {
        this.cityService = cityService;
    }

    @Override
    public City parse(String text, Locale locale) throws ParseException {
        return cityService.getCityByName(text).orElse(null);
    }

    @Override
    public String print(City city, Locale locale) {
        return city.getName();
    }
}
