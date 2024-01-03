package com.example.bankapp1.DTO;

import com.example.bankapp1.entities.Customer;
import lombok.*;

import java.util.UUID;
@Data
public class CustomerDTO {
    // заходит и возвращает поля айди фамилия и тд, возвращает ответ на мой запрос
    private String firstName;
    private String lastName;
    private String email;
    private String accountName;

}


