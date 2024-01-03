package com.example.bankapp1.repository;


import com.example.bankapp1.entities.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepository  extends JpaRepository<Manager, String> {
}
