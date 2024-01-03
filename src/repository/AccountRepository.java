package com.example.bankapp1.repository;

import com.example.bankapp1.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository

public interface AccountRepository extends JpaRepository<Account, Long> {

    void delete(String string);

}
