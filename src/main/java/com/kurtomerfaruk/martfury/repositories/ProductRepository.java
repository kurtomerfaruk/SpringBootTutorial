package com.kurtomerfaruk.martfury.repositories;

import com.kurtomerfaruk.martfury.models.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 16.07.2024 19:51
 */
public interface ProductRepository extends PagingAndSortingRepository<Product,Long> {
    Optional<Product> findById(Long id);
}
