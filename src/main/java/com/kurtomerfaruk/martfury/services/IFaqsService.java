package com.kurtomerfaruk.martfury.services;

import com.kurtomerfaruk.martfury.models.Faqs;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 14.07.2024 11:24
 */
public interface IFaqsService {
    Page<Faqs> findAll(int page, int size);
}
