package com.kurtomerfaruk.martfury.repositories;

import com.kurtomerfaruk.martfury.models.Countries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 14.07.2024 11:07
 */
public interface CountriesRepository extends JpaRepository<Countries,Long> {
}
