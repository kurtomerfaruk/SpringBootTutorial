package com.kurtomerfaruk.martfury.services.impl;

import com.kurtomerfaruk.martfury.models.Country;
import com.kurtomerfaruk.martfury.repositories.CountryRepository;
import com.kurtomerfaruk.martfury.services.ICountryService;
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
public class CountryService implements ICountryService {
    private final CountryRepository countriesRepository;


    @Override
    public List<Country> findAll() {
        return countriesRepository.findAll();
    }
}
