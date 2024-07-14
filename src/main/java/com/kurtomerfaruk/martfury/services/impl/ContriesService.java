package com.kurtomerfaruk.martfury.services.impl;

import com.kurtomerfaruk.martfury.models.Countries;
import com.kurtomerfaruk.martfury.repositories.CountriesRepository;
import com.kurtomerfaruk.martfury.services.ICountriesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 14.07.2024 11:08
 */
@Service
@RequiredArgsConstructor
public class ContriesService implements ICountriesService {
    private final CountriesRepository countriesRepository;


    @Override
    public List<Countries> findAll() {
        return countriesRepository.findAll();
    }
}
