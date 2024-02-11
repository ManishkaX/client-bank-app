package bsuir.labs.clientbankapp.service;

import bsuir.labs.clientbankapp.model.City;
import bsuir.labs.clientbankapp.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityService {
    private final CityRepository cityRepository;

    @Autowired
    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public List<City> getAll() {
        return cityRepository.findAll();
    }

    public Optional<City> getCityByName(String name) {
        return cityRepository.findByName(name);
    }

    public void addCity(String name) {
        var city = new City(name);
        cityRepository.save(city);
    }
}
