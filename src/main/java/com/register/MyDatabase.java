package com.register;

import java.io.Serializable;

public class MyDatabase implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private int date;
    private String contact;
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getAddress() {
        return date;
    }
    public void setAddress(String address) {
        this.date = date;
    }
    public String getContact() {
        return contact;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
}