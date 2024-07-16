package com.kurtomerfaruk.martfury.repositories;

import com.kurtomerfaruk.martfury.models.EcOrders;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 16.07.2024 15:34
 */
public interface EcOrdersRepository extends PagingAndSortingRepository<EcOrders,Long> {
}
