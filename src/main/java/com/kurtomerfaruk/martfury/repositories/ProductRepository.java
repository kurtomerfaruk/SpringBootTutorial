package com.kurtomerfaruk.martfury.repositories;

import com.kurtomerfaruk.martfury.models.Product;
import jakarta.persistence.QueryHint;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 16.07.2024 19:51
 */
@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product,Long> {
    @QueryHints({@QueryHint(name = "org.hibernate.cacheable",value = "true")})
    Optional<Product> findById(Long id);

    List<Product> findBySku(String sku);
}
