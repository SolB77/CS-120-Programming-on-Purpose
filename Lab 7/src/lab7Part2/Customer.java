package lab7Part2;

import java.util.Scanner;

public class Customer {
    public String name;
    public String address;
    public String phoneNumber;
    public float balance;
    public int accountNumber;
    public String password;

    void setName(String name) {
        this.name = name;
    }

    void setAddress(String address) {
        this.address = address;
    }

    void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    void setBalance(float balance) {
        this.balance = balance;
    }

    void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    void setPassword(String password) {
        this.password = password;
    }

    String getName() {
        return this.name;
    }

    String getAddress() {
        return this.address;
    }

    String getPhoneNumber() {
        return this.phoneNumber;
    }

    float getBalance() {
        return this.balance;
    }

    int getAccountNumber() {
        return this.accountNumber;
    }

    String getPassword() {
        return this.password;
    }

}
