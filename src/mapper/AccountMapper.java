package com.example.bankapp1.mapper;

import com.example.bankapp1.DTO.AccountDTO;
import com.example.bankapp1.entities.Account;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AccountMapper {
    @Named("toDto")
    AccountDTO mapToDTO(Account account);
    @Mapping(source = "id", target = "id")
    Account mapToEntity (AccountDTO accountDTO);
}
