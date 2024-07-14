package com.kurtomerfaruk.martfury.services.impl;

import com.kurtomerfaruk.martfury.models.Countries;
import com.kurtomerfaruk.martfury.models.Faqs;
import com.kurtomerfaruk.martfury.repositories.FaqsRepository;
import com.kurtomerfaruk.martfury.services.IFaqsService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 14.07.2024 11:25
 */
@Service
@RequiredArgsConstructor
public class FaqsService implements IFaqsService {

    private final FaqsRepository faqsRepository;

    @Override
    public Page<Faqs> findAll(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return faqsRepository.findAll(pageable);
    }
}
