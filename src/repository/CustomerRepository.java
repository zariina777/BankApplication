package com.example.bankapp1.repository;


import com.example.bankapp1.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<Customer, String> {
}
