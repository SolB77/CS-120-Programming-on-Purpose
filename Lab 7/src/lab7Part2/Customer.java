package lab7Part2;

import java.util.Scanner;

public class Customer {
    private String name;
    private String address;
    private String phoneNumber;
    private float balance;
    private String accountNumber;
    private String password;

    Scanner custScan = new Scanner(System.in);

    void openAccount() {
        String firstTryPass = "abc";
        String secondTryPass = "def";
        System.out.println("Enter your name: ");
        this.name = custScan.nextLine();
        System.out.println("Enter your address: ");
        this.address = custScan.nextLine();
        System.out.println("Enter your phone number: ");
        this.phoneNumber = custScan.nextLine();
        System.out.println("How much would you like to initially deposit: ");
        this.balance = custScan.nextFloat();
        System.out.println("Enter an account number: ");
        this.accountNumber = custScan.next();
        while (!firstTryPass.equals(secondTryPass)) {
            System.out.println("Enter a password: ");
            firstTryPass = custScan.next();
            System.out.println("Re-enter the password: ");
            secondTryPass = custScan.next();
            if (!firstTryPass.equals(secondTryPass)) {
                System.out.println("Passwords are not the same! Try again!");
            }
            else {
                this.password = secondTryPass;
                System.out.println("Password successfully set!");
            }
        }
    }

    void changePassword() {
        int attempts = 0;
        String firstTryPass = "abc";
        String secondTryPass = "def";
        boolean correctCurrentPass = false;
        while ((attempts < 3)||(correctCurrentPass == false)) {
            System.out.println("Enter your current password: ");
            String currentPassword = custScan.next();
            attempts++;
            if (currentPassword.equals(this.password)) {
                correctCurrentPass = true;
                while (!firstTryPass.equals(secondTryPass)) {
                    System.out.println("Enter your new password: ");
                    firstTryPass = custScan.next();
                    System.out.println("Re-enter your new password: ");
                    secondTryPass = custScan.next();
                    if (!firstTryPass.equals(secondTryPass)) {
                        System.out.println("Passwords are not the same! Try again!");
                    }
                    else {
                        this.password = secondTryPass;
                        System.out.println("Password successfully set!");
                    }
                }
            }
        }
    }

    void deposit() {
        System.out.println("Enter the amount you would like to deposit: ");
        float depositAmount = custScan.nextFloat();
        this.balance = this.balance + depositAmount;
        System.out.println("Successfully deposited!");
        System.out.println();
    }

    void withdraw() {
        System.out.println("Enter the amount you would like to withdraw: ");
        float withdrawalAmount = custScan.nextFloat();
        this.balance = this.balance - withdrawalAmount;
        System.out.println("Successfully withdrawn!");
        System.out.println();
    }

    void printAccountInfo() {
        System.out.println("Printing Account Information...");
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Phone: " + this.phoneNumber);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Balance: " + this.balance);
        System.out.println();
    }


}
