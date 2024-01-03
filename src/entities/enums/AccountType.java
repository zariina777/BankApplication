package com.example.bankapp1.entities.enums;

public enum AccountType {
    CREDIT("KREDIT"),
    DEPOSIT("DEPOSIT"),
    CURRENT("CURRENT");

    private final String value;
    AccountType(String value) {this.value=value;}
    public String getValue() {return value;}
}
