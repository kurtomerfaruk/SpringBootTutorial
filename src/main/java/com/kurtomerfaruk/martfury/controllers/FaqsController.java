package com.kurtomerfaruk.martfury.controllers;

import com.kurtomerfaruk.martfury.customs.CustomPage;
import com.kurtomerfaruk.martfury.models.Faqs;
import com.kurtomerfaruk.martfury.services.IFaqsService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 14.07.2024 11:26
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/faqs")
public class FaqsController {

    private final IFaqsService faqsService;

    @GetMapping
    public ResponseEntity<CustomPage<Faqs>> getAll(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size){
        Page<Faqs> results = faqsService.findAll(page,size);
        CustomPage<Faqs> customPage = new CustomPage<>(results);
        return ResponseEntity.ok(customPage);
    }
}
