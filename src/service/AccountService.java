package com.example.bankapp1.service;


import com.example.bankapp1.DTO.AccountDTO;

import java.util.UUID;

import static org.springframework.data.projection.EntityProjection.ProjectionType.DTO;

public interface AccountService {
    AccountDTO getAccountDtoById(Long id);
    AccountDTO createAccount(AccountDTO accountDTO);
    void deleteAccountByNumber(String string);


}
