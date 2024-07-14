package com.kurtomerfaruk.martfury.repositories;

import com.kurtomerfaruk.martfury.models.Faqs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 14.07.2024 11:24
 */
public interface FaqsRepository extends PagingAndSortingRepository<Faqs,Long> {
}
