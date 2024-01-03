package com.example.bankapp1.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")                  //идентификатор продукта банка
    private UUID id;

    @Column(name = "product_name")        // Название продукта банка
    private String productName;

    @Column(name = "description")         // Описание продукта
    private String description;

    @Column(name = "interest_rate")       // Процентная ставка по продукту
    private double interestRate;

    @Column(name = "currency")            // Валюта, в которой предоставляется продукт
    private String currency;


    @OneToMany(mappedBy = "product")
    private List<Agreement> agreement;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "accountId", referencedColumnName = "id")
    private Account accountId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customerId", referencedColumnName = "id")
    private Customer customerId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "managerId", referencedColumnName = "id")
    private Manager managerId;



}
