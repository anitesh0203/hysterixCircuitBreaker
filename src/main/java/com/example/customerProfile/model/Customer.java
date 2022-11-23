package com.example.customerProfile.model;

public class Customer {
    String userName;
    String name;
    Address address;

    public Customer() {
    }

    public Customer(String userName, String name, Address address) {
        this.userName = userName;
        this.name = name;
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
