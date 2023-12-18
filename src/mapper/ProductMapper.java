package com.example.bankapp1.mapper;

import com.example.bankapp1.DTO.ProductDTO;
import com.example.bankapp1.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Named;
@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Named("toDto")
    ProductDTO ToDTO(Product product);
}
