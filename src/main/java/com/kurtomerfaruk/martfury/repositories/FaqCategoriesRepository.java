package com.kurtomerfaruk.martfury.repositories;

import com.kurtomerfaruk.martfury.models.FaqCategories;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 14.07.2024 13:00
 */
public interface FaqCategoriesRepository extends PagingAndSortingRepository<FaqCategories,Long> {
}
