package com.kurtomerfaruk.martfury.repositories;

import com.kurtomerfaruk.martfury.models.Faq;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 14.07.2024 11:24
 */
public interface FaqRepository extends PagingAndSortingRepository<Faq,Long> {
}
