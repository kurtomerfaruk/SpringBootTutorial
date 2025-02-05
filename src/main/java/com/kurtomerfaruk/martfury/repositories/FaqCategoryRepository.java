package com.kurtomerfaruk.martfury.repositories;

import com.kurtomerfaruk.martfury.models.FaqCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 14.07.2024 13:00
 */
@Repository
public interface FaqCategoryRepository extends JpaRepository<FaqCategory,Long> {
}
