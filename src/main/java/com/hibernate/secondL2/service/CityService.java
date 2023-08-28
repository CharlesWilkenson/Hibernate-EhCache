package com.hibernate.secondL2.service;

import com.hibernate.secondL2.entity.City;
import com.hibernate.secondL2.repository.CityRepository;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    private final CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public City getCityById(Integer id) {
        return cityRepository.findById(id).orElseThrow(() -> new RuntimeException("Invalid city id"));
    }

    public City saveCity(City city) {
        return cityRepository.save(city);
    }

    public City updateCity(City c) {
        City city = cityRepository.findById(c.getId()).orElseThrow(() -> new RuntimeException("Invalid city id"));
        city.setName(c.getName());
        city.setPopulation(c.getPopulation());
        cityRepository.save(city);
        return city;
    }
}
