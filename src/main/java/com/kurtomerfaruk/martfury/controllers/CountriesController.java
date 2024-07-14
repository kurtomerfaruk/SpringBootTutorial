package com.kurtomerfaruk.martfury.controllers;

import com.kurtomerfaruk.martfury.models.Countries;
import com.kurtomerfaruk.martfury.services.ICountriesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 14.07.2024 11:09
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/countries")
public class CountriesController {
    private final ICountriesService countriesService;

    @GetMapping
    public ResponseEntity<List<Countries>> getAll(){
       List<Countries> result= countriesService.findAll();
       return ResponseEntity.ok(result);
    }
}
