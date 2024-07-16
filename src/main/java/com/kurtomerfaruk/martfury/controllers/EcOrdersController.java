package com.kurtomerfaruk.martfury.controllers;

import com.kurtomerfaruk.martfury.customs.CustomPage;
import com.kurtomerfaruk.martfury.models.EcOrders;
import com.kurtomerfaruk.martfury.services.IEcOrdersService;
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
 * @since 16.07.2024 15:37
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/orders")
public class EcOrdersController {

    private final IEcOrdersService ordersService;

    @GetMapping
    public ResponseEntity<CustomPage<EcOrders>> getAll(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size){
        Page<EcOrders> results = ordersService.findAll(page,size);
        CustomPage<EcOrders> customPage = new CustomPage<>(results);
        return ResponseEntity.ok(customPage);
    }
}
