package com.kurtomerfaruk.martfury.repositories;

import com.kurtomerfaruk.martfury.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 14.07.2024 11:07
 */
public interface CountryRepository extends JpaRepository<Country,Long> {
}
