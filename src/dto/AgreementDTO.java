package com.example.bankapp1.DTO;

import lombok.Data;

import java.util.UUID;

@Data
public class AgreementDTO {
    private String accountNumber;
    private String account_type;
    private String currency;
    private UUID id;
}
