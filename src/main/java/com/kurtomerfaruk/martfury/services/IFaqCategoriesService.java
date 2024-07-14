package com.kurtomerfaruk.martfury.services;

import com.kurtomerfaruk.martfury.models.FaqCategories;
import org.springframework.data.domain.Page;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 14.07.2024 13:01
 */
public interface IFaqCategoriesService {
    Page<FaqCategories> findAll(int page, int size);
}
