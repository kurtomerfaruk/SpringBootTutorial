package com.kurtomerfaruk.martfury.products;

import com.kurtomerfaruk.martfury.models.Product;
import com.kurtomerfaruk.martfury.repositories.ProductRepository;
import com.kurtomerfaruk.martfury.services.impl.ProductService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


/**
 * @author Omer Faruk KURT kurtomerfaruk@gmail.com
 * @version 1.0.0
 * @since 16.07.2024 20:21
 */
@SpringBootTest
@ExtendWith(MockitoExtension.class)
@AutoConfigureMockMvc
public class ProductTest {
    @InjectMocks
    private ProductService productService;

    @Mock
    private ProductRepository productRepository;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetProductById() throws  Exception{
        long productId=1L;
        String sku = "SW-107-A0";
        int storeId = 4;
        Product mockProduct = Product.builder().id(productId).sku(sku).storeId(4).build();

        Mockito.when(productRepository.findById(productId)).thenReturn(Optional.of(mockProduct));

        Product result = productService.getProductById(productId).get();

        assertNotNull(result);
        assertEquals(productId, result.getId());
        assertEquals("SW-107-A0", result.getSku());
        assertEquals(4, result.getStoreId());
    }

    @Test
    public  void testProductEndpoint() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/api/products"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}
