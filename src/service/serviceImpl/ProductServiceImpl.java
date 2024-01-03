package com.example.bankapp1.service.serviceImpl;


import com.example.bankapp1.DTO.ProductDTO;
import com.example.bankapp1.mapper.ProductMapper;
import com.example.bankapp1.repository.ProductRepository;
import com.example.bankapp1.service.ProductService;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;
    @Override
    public ProductDTO findProductById(UUID id) {
        return productMapper.ToDTO(productRepository.findById(String.valueOf(id)).get());
    }

    @Override
    public void deleteProductById(UUID uuid) {
        try {
            productRepository.deleteById(String.valueOf(uuid));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    @Override
    public ProductDTO getProductById(UUID id) {
        return productMapper.ToDTO(productRepository.findById(String.valueOf(id)).get());
    }
}
