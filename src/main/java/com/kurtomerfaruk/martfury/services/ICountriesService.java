package com.kurtomerfaruk.martfury.services;

import com.kurtomerfaruk.martfury.models.Countries;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 14.07.2024 11:08
 */
public interface ICountriesService {
    List<Countries> findAll();
}
