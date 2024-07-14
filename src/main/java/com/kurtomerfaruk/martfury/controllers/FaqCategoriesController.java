package com.kurtomerfaruk.martfury.controllers;

import com.kurtomerfaruk.martfury.customs.CustomPage;
import com.kurtomerfaruk.martfury.models.FaqCategories;
import com.kurtomerfaruk.martfury.services.IFaqCategoriesService;
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
 * @since 14.07.2024 13:03
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/faqcategories")
public class FaqCategoriesController {
    private final IFaqCategoriesService faqCategoriesService;

    @GetMapping
    public ResponseEntity<CustomPage<FaqCategories>> getAll(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size){
        Page<FaqCategories> results = faqCategoriesService.findAll(page,size);
        CustomPage<FaqCategories> customPage = new CustomPage<FaqCategories>(results);
        return ResponseEntity.ok(customPage);
    }
}
