package com.example.bankapp1.mapper;

import com.example.bankapp1.DTO.AccountDTO;
import com.example.bankapp1.DTO.TransactionDTO;
import com.example.bankapp1.entities.Account;
import com.example.bankapp1.entities.Transaction;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface TransactionMapper {
    @Named("toDto")
    TransactionDTO mapToDTO(Transaction transaction);

}
