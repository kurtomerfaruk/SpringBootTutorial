package com.kurtomerfaruk.martfury.services;

import com.kurtomerfaruk.martfury.models.Faq;
import org.springframework.data.domain.Page;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 14.07.2024 11:24
 */
public interface IFaqService {
    Page<Faq> findAll(int page, int size);
}
