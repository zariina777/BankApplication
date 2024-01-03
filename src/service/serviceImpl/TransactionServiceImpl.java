package com.example.bankapp1.service.serviceImpl;


import com.example.bankapp1.DTO.TransactionDTO;
import com.example.bankapp1.mapper.TransactionMapper;
import com.example.bankapp1.repository.TransactionRepository;
import com.example.bankapp1.service.TransactionService;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;


import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {
    private final TransactionRepository transactionRepository;
    private final TransactionMapper transactionMapper;

    @Override
    public TransactionDTO findTransactionById(UUID id) {

        return transactionMapper.mapToDTO(transactionRepository.findById(String.valueOf(id)).get());
    }

    @Override
    public void deleteTransactionById(UUID uuid) {
        try {
            transactionRepository.deleteById(String.valueOf(uuid));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
