package com.example.bankapp1.service;



import com.example.bankapp1.DTO.CustomerDTO;

import java.util.UUID;

public interface CustomerService {
    CustomerDTO getCustomerById(String name);

    CustomerDTO createCustomer(CustomerDTO customerDTO);

    void deleteCustomerById(String string);
}
