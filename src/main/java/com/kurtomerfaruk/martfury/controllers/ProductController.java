package com.kurtomerfaruk.martfury.controllers;

import com.kurtomerfaruk.martfury.customs.CustomPage;
import com.kurtomerfaruk.martfury.exceptions.ResourceNotFoundException;
import com.kurtomerfaruk.martfury.models.Product;
import com.kurtomerfaruk.martfury.services.IProductService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 16.07.2024 19:54
 */
@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private IProductService productService;

    @Operation(summary = "Product Listing",description = "This method lists a product")
    @GetMapping
    public ResponseEntity<CustomPage<Product>> getAll(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size){
        Page<Product> results = productService.findAll(page,size);
        CustomPage<Product> customPage = new CustomPage<>(results);
        return ResponseEntity.ok(customPage);
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        Optional<Product> productOptional= productService.getProductById(id);
        if(productOptional.isPresent()){
            return productOptional.get();
        }
        throw new ResourceNotFoundException(String.format("Product with ID %s not found", id));
    }

    @GetMapping("/sku/{sku}")
    public List<Product> getProductBySku(@PathVariable String sku){
        List<Product> products = productService.getProductBySku(sku);
        if(products.isEmpty()){
            throw  new ResourceNotFoundException(String.format("Product with SKU %s not found",sku));
        }
       return products;
    }
}
