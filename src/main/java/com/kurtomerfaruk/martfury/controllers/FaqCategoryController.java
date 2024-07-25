package com.kurtomerfaruk.martfury.controllers;

import com.kurtomerfaruk.martfury.customs.CustomPage;
import com.kurtomerfaruk.martfury.models.FaqCategory;
import com.kurtomerfaruk.martfury.services.IFaqCategoryService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 14.07.2024 13:03
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/faqcategories")
@Slf4j
public class FaqCategoryController {
    private final IFaqCategoryService faqCategoriesService;

    @GetMapping
    public ResponseEntity<CustomPage<FaqCategory>> getAll(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size){
        Page<FaqCategory> results = faqCategoriesService.findAll(page,size);
        CustomPage<FaqCategory> customPage = new CustomPage<FaqCategory>(results);
        return ResponseEntity.ok(customPage);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<FaqCategory> create(@Valid @RequestBody FaqCategory faqCategories)  {
       faqCategoriesService.save(faqCategories);
       log.info("faqcategories created");
       return ResponseEntity.ok(faqCategories);
    }

    @PutMapping("/{id}/edit")
    public ResponseEntity<FaqCategory> update (@PathVariable Long id, @Valid @RequestBody FaqCategory faqCategories){
        faqCategoriesService.update(id,faqCategories);
        log.info("faqcategories updated");
        return ResponseEntity.ok(faqCategories);
    }

    @DeleteMapping("/{id}/delete")
    public void delete(@PathVariable Long id){
        faqCategoriesService.delete(id);
    }
}
