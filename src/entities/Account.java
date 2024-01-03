package com.example.bankapp1.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "account_number")
    private String accountNumber;
    @Column(name = "balance")
    private double balance;
    @Column(name = "account_type")
    private String accountType;
    @Column(name = "currency")
    private String currency;



    @OneToMany(mappedBy = "manager", cascade = CascadeType.ALL)  // у одного мэнэжера много продуктов
    private Set<Product> products= new HashSet<>();

    @OneToOne(mappedBy = "account")
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;

    @OneToMany(mappedBy = "account")
    private List<Transaction> transactions;

}
