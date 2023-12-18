package com.example.bankapp1.Controller;


import com.example.bankapp1.DTO.TransactionDTO;
import com.example.bankapp1.service.TransactionService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.UUID;
@AllArgsConstructor
@RestController // work with objekt
@RequestMapping("/customers") // links browser
public class TransactionController {
    private final TransactionService transactionService;

    @GetMapping("/{id}")
    public ResponseEntity<TransactionDTO> findTransactionById(@PathVariable("id") UUID id) {
        return new ResponseEntity<>(transactionService.findTransactionById(id), HttpStatus.OK);
    }
    @DeleteMapping("/{string}")
    public void deleteTransactionById(@PathVariable UUID uuid) {transactionService.deleteTransactionById(uuid);
    }
}
