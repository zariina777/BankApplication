package com.example.bankapp1.service;


import com.example.bankapp1.DTO.ProductDTO;

import java.util.UUID;

public interface ProductService {
    ProductDTO findProductById(UUID id);

    void deleteProductById(UUID uuid);

    ProductDTO getProductById(UUID id);
}
