package com.kurtomerfaruk.martfury.controllers;

import com.kurtomerfaruk.martfury.models.Country;
import com.kurtomerfaruk.martfury.services.ICountryService;
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
@RequestMapping("/api/v1/countries")
public class CountryController {
    private final ICountryService countriesService;

    @GetMapping
    public ResponseEntity<List<Country>> getAll(){
       List<Country> result= countriesService.findAll();
       return ResponseEntity.ok(result);
    }
}
