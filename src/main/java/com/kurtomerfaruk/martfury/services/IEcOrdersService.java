package com.kurtomerfaruk.martfury.services;

import com.kurtomerfaruk.martfury.models.EcOrders;
import org.springframework.data.domain.Page;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 16.07.2024 15:35
 */
public interface IEcOrdersService {
    Page<EcOrders> findAll(int page, int size);
}
