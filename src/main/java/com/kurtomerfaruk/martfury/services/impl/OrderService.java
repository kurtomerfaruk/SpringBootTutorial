package com.kurtomerfaruk.martfury.services.impl;

import com.kurtomerfaruk.martfury.models.Order;
import com.kurtomerfaruk.martfury.repositories.OrderRepository;
import com.kurtomerfaruk.martfury.services.IOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 16.07.2024 15:35
 */
@Service
@RequiredArgsConstructor
public class OrderService implements IOrderService {

    private final OrderRepository ordersRepository;

    @Cacheable(value = "orders")
    @Override
    public Page<Order> findAll(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return ordersRepository.findAll(pageable);
    }
}
