package com.kurtomerfaruk.martfury.services;

import com.kurtomerfaruk.martfury.models.Product;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Optional;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 16.07.2024 19:52
 */
public interface IProductService {
    Page<Product> findAll(int page, int size);
    Optional<Product> getProductById(Long id);
    List<Product> getProductBySku(String sku);
}
