package com.example.bankapp1.mapper;

import com.example.bankapp1.DTO.CustomerDTO;
import com.example.bankapp1.DTO.ManagerDTO;
import com.example.bankapp1.entities.Customer;
import com.example.bankapp1.entities.Manager;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface ManagerMapper {
    @Named("toDto")
    ManagerDTO ToDTO(Manager manager);
}
