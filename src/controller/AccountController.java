package com.example.bankapp1.Controller;

import com.example.bankapp1.DTO.AccountDTO;
import com.example.bankapp1.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/auth/accounts")
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;

    @GetMapping("/{id}")
    public ResponseEntity<AccountDTO> getAccountById(@PathVariable("id")Long id){
        return new ResponseEntity<>(accountService.getAccountDtoById(id), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<AccountDTO> createAccount(@RequestBody AccountDTO accountDTO) {
        return new ResponseEntity<>(accountService.createAccount(accountDTO), HttpStatus.CREATED);
    }
    @DeleteMapping("/{string}")
    public void deleteAccountByNumber(@PathVariable String string) {
        accountService.deleteAccountByNumber(string);
    }



}
