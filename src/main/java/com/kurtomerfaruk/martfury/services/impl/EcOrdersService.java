package com.kurtomerfaruk.martfury.services.impl;

import com.kurtomerfaruk.martfury.models.EcOrders;
import com.kurtomerfaruk.martfury.repositories.EcOrdersRepository;
import com.kurtomerfaruk.martfury.services.IEcOrdersService;
import lombok.RequiredArgsConstructor;
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
public class EcOrdersService implements IEcOrdersService {

    private final EcOrdersRepository ordersRepository;

    @Override
    public Page<EcOrders> findAll(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return ordersRepository.findAll(pageable);
    }
}
