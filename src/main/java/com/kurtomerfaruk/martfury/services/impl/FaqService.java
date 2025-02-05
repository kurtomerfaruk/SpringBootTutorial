package com.kurtomerfaruk.martfury.services.impl;

import com.kurtomerfaruk.martfury.models.Faq;
import com.kurtomerfaruk.martfury.repositories.FaqRepository;
import com.kurtomerfaruk.martfury.services.IFaqService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 14.07.2024 11:25
 */
@Service
@RequiredArgsConstructor
public class FaqService implements IFaqService {

    private final FaqRepository faqsRepository;

    @Override
    public Page<Faq> findAll(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return faqsRepository.findAll(pageable);
    }
}
