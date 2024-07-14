package com.kurtomerfaruk.martfury.services.impl;

import com.kurtomerfaruk.martfury.models.FaqCategories;
import com.kurtomerfaruk.martfury.repositories.FaqCategoriesRepository;
import com.kurtomerfaruk.martfury.services.IFaqCategoriesService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 14.07.2024 13:01
 */
@Service
@RequiredArgsConstructor
public class FaqCategoriesService implements IFaqCategoriesService {

    private final FaqCategoriesRepository faqCategoriesRepository;
    @Override
    public Page<FaqCategories> findAll(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return faqCategoriesRepository.findAll(pageable);
    }
}
