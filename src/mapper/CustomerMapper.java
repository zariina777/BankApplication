package com.example.bankapp1.mapper;

import com.example.bankapp1.DTO.AccountDTO;
import com.example.bankapp1.DTO.CustomerDTO;
import com.example.bankapp1.entities.Account;
import com.example.bankapp1.entities.Customer;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")

public interface CustomerMapper {
    @Named("toDto")
    CustomerDTO ToDTO(Customer customer);

}



