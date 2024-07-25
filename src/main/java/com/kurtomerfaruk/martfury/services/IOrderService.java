package com.kurtomerfaruk.martfury.services;

import com.kurtomerfaruk.martfury.models.Order;
import org.springframework.data.domain.Page;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 16.07.2024 15:35
 */
public interface IOrderService {
    Page<Order> findAll(int page, int size);
}
