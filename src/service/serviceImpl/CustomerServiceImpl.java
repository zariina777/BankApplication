package com.example.bankapp1.service.serviceImpl;


import com.example.bankapp1.DTO.CustomerDTO;
import com.example.bankapp1.mapper.CustomerMapper;
import com.example.bankapp1.repository.CustomerRepository;
import com.example.bankapp1.service.CustomerService;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;


import java.util.UUID;
@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;
    @Override
    public CustomerDTO getCustomerById(String name) {
        return customerMapper.ToDTO(customerRepository.findById(String.valueOf(name)).get());
    }

    @Override
    public CustomerDTO createCustomer(CustomerDTO customerDTO) {
        return customerMapper.ToDTO(customerRepository.save(customerMapper.ToEntity(customerDTO)));
    }

    @Override
    public void deleteCustomerById(String string) {
        try {
            customerRepository.deleteById(string);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
