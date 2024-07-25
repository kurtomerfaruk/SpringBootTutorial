package com.kurtomerfaruk.martfury.services;

import com.kurtomerfaruk.martfury.models.FaqCategory;
import org.springframework.data.domain.Page;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 14.07.2024 13:01
 */
public interface IFaqCategoryService {

    FaqCategory save(FaqCategory faqCategories);
    Page<FaqCategory> findAll(int page, int size);

    FaqCategory update(Long id, FaqCategory faqCategories);

    void delete(Long id);
}
