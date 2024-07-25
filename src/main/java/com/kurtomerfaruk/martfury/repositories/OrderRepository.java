package com.kurtomerfaruk.martfury.repositories;

import com.kurtomerfaruk.martfury.models.Order;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 16.07.2024 15:34
 */
public interface OrderRepository extends PagingAndSortingRepository<Order,Long> {
}
