package com.example.bankapp1.service.serviceImpl;


import com.example.bankapp1.DTO.AccountDTO;
import com.example.bankapp1.mapper.AccountMapper;
import com.example.bankapp1.repository.AccountRepository;
import com.example.bankapp1.service.AccountService;
import lombok.RequiredArgsConstructor;

import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
   private final AccountRepository accountRepository;
   private final AccountMapper accountMapper;

   @Override
   public AccountDTO getAccountDtoById(Long id) {

      try {
           return accountMapper.mapToDTO(accountRepository.findById(id)
                   .orElseThrow(ChangeSetPersister.NotFoundException::new));
       } catch (ChangeSetPersister.NotFoundException e) {
           throw new RuntimeException(e);
       }
   }

   @Override
   public AccountDTO createAccount(AccountDTO accountDTO) {

       return accountMapper.mapToDTO(accountRepository.save(accountMapper.mapToEntity(accountDTO)));
   }

   @Override
   public void deleteAccountByNumber(String string) {

       accountRepository.delete(string);

   }
}
