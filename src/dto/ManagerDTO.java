package com.example.bankapp1.DTO;

import lombok.Data;

import java.util.UUID;

@Data
public class ManagerDTO {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private UUID id;
}
