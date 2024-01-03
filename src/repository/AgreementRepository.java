package com.example.bankapp1.repository;

import com.example.bankapp1.entities.Agreement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AgreementRepository  extends JpaRepository<Agreement, UUID> {
}
