package com.example.bankapp1.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private UUID id;                       // идентификатор транзакции

    @Column(name = "transaction_type")
    private String transactionType;        // Тип транзакции (перевод, снятие, пополнение и т.д.)

    @Column(name = "amount")
    private double amount;                 // Сумма транзакции

    @Column(name = "transaction_date")
    private Date transactionDate;          // Дата и время транзакции

    @Column(name = "description")
    private String description;            // Описание транзакции

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

}
