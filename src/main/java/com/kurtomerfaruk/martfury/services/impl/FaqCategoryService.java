package com.kurtomerfaruk.martfury.services.impl;

import com.kurtomerfaruk.martfury.models.FaqCategory;
import com.kurtomerfaruk.martfury.repositories.FaqCategoryRepository;
import com.kurtomerfaruk.martfury.services.IFaqCategoryService;
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
public class FaqCategoryService implements IFaqCategoryService {

    private final FaqCategoryRepository faqCategoriesRepository;

    @Override
    public FaqCategory save(FaqCategory faqCategories) {
        return faqCategoriesRepository.save(faqCategories);
    }

    @Override
    public Page<FaqCategory> findAll(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return faqCategoriesRepository.findAll(pageable);
    }

    @Override
    public FaqCategory update(Long id, FaqCategory faqCategories) {
        faqCategories.setId(id);
        return faqCategoriesRepository.save(faqCategories);
    }

    @Override
    public void delete(Long id) {
       faqCategoriesRepository.deleteById(id);
    }
}
