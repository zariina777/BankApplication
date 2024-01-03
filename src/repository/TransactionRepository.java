package com.example.bankapp1.repository;


import com.example.bankapp1.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository  extends JpaRepository<Transaction, String> {
}
