package com.example.customerProfile.model;

import lombok.Data;

@Data
public class Address {
    String userName;
    String line1;
    String subdivision;
    String country;
    String zip;

    public Address() {
    }

    public Address(String userName, String line1, String city, String country, String zip) {
        this.userName = userName;
        this.line1 = line1;
        this.subdivision = city;
        this.country = country;
        this.zip = zip;
    }
}
