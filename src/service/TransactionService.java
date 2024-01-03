package com.example.bankapp1.service;



import com.example.bankapp1.DTO.TransactionDTO;

import java.util.UUID;

public interface TransactionService {
    TransactionDTO findTransactionById(UUID id);

    void deleteTransactionById(UUID uuid);
}
