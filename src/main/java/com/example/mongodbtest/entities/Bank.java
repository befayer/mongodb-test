package com.example.mongodbtest.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Bank {
    @Id
    private String id;
    @Indexed(unique = true)
    private String bankName;
    private String bankCity;

    public Bank(String id,
                String bankName,
                String bankCity) {
        this.id = id;
        this.bankName = bankName;
        this.bankCity = bankCity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankCity() {
        return bankCity;
    }

    public void setBankCity(String bankCity) {
        this.bankCity = bankCity;
    }
}
