package com.hibernate.secondL2.rest;

import com.hibernate.secondL2.entity.City;
import com.hibernate.secondL2.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cities")
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("/{id}")
    public ResponseEntity<City> getCityById(@PathVariable(name = "id") Integer id){
        return new ResponseEntity<>(cityService.getCityById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<City> saveCity(@RequestBody City city){
        return new ResponseEntity<>(cityService.saveCity(city), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<City> updateCity(@RequestBody City city){
        return new ResponseEntity<>(cityService.saveCity(city), HttpStatus.CREATED);
    }
}
