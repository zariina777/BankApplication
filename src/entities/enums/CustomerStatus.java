package com.example.bankapp1.entities.enums;

public enum CustomerStatus {
    ACTIVE("ACTIVE"),
    PENDING("PENDING"),
    REMOVED("REMOVED"),
    BLOCKED("BLOCKED");

    private final String value;
    CustomerStatus(String value) {this.value=value;}
    public String getValue() {return value;}
}
