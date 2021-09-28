package lab7Part2;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    // Bank variables
    int numCustomers = 0;
    int currentAccountLoggedIn = 0;
    boolean loggedIn = false;

    // ArrayList of bank customers
    ArrayList<Customer> customers = new ArrayList<Customer>();

    // Method to open a new account
    void openAccount() {
        Scanner openAccountScnr = new Scanner(System.in);
        Customer customer = new Customer();
        customer.setAccountNumber(numCustomers);
        String firstTryPass = "abc";
        String secondTryPass = "def";
        System.out.println("Create Account Number " + numCustomers + "...");
        System.out.println("Enter your name: ");
        String name = openAccountScnr.nextLine();
        customer.setName(name);
        System.out.println("Enter your address: ");
        String address = openAccountScnr.nextLine();
        customer.setAddress(address);
        System.out.println("Enter your phone number: ");
        String phoneNumber = openAccountScnr.nextLine();
        customer.setPhoneNumber(phoneNumber);
        System.out.println("How much would you like to initially deposit: ");
        float balance = openAccountScnr.nextFloat();
        customer.setBalance(balance);
        while (!firstTryPass.equals(secondTryPass)) {
            System.out.println("Enter a password: ");
            firstTryPass = openAccountScnr.next();
            System.out.println("Re-enter the password: ");
            secondTryPass = openAccountScnr.next();
            if (!firstTryPass.equals(secondTryPass)) {
                System.out.println("Passwords are not the same! Try again!");
            }
            else {
                String password = secondTryPass;
                customer.setPassword(password);
                System.out.println("Password successfully set!");
            }
        }
        customers.add(customer);
        System.out.println("Account number " + numCustomers + " successfully created!");
        System.out.println();
        numCustomers++;
    }

    // Method to login
    void login() {
        Scanner loginScnr = new Scanner(System.in);
        boolean accFound = false;
        int accNumber = 0;
        int loginAttempts = 3;
        while (!loggedIn && loginAttempts>0) {
            // Find Account
            while (!accFound) {
                System.out.println("Account Number: ");
                accNumber = loginScnr.nextInt();
                if (accNumber < customers.size()) {
                    accFound = true;
                }
                else if (accNumber >= customers.size()) {
                    System.out.println("Account doesn't exist. Try again!");
                    System.out.println();
                }
            }
            // Check Password
            System.out.println("Password: ");
            String password = loginScnr.next();
            if (password.equals(customers.get(accNumber).getPassword())) {
                loggedIn = true;
                currentAccountLoggedIn = accNumber;
                System.out.println("Account number " + accNumber + " successfully logged in!");
            }
            else if (!password.equals(customers.get(accNumber).getPassword())) {
                loginAttempts--;
                System.out.println("Password is not correct! " + loginAttempts + "attempts left!");
            }
        }
        if (loginAttempts == 0) {
            System.out.println("Too many login attempts! Returning to the main menu!");
        }
        System.out.println();
    }

    // Method to change password
    void changePassword() {
        int attempts = 0;
        String firstTryPass = "abc";
        String secondTryPass = "def";
        boolean correctCurrentPass = false;
        Scanner custScan = new Scanner(System.in);
        while ((attempts < 3) && (correctCurrentPass == false)) {
            System.out.println("Enter your current password: ");
            String currentPassword = custScan.next();
            attempts++;
            if (currentPassword.equals(customers.get(currentAccountLoggedIn).getPassword())) {
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
                        customers.get(currentAccountLoggedIn).setPassword(firstTryPass);
                        System.out.println("Password successfully set!");
                    }
                }
            }
        }
        if (attempts == 3) {
            System.out.println("Too many attempts to enter the correct current password!");
        }
    }

    // Method to deposit money
    void deposit() {
        Scanner depScan = new Scanner(System.in);
        System.out.println("Enter the amount you would like to deposit: ");
        float depositAmount = depScan.nextFloat();
        float newBalance = customers.get(currentAccountLoggedIn).getBalance() + depositAmount;
        customers.get(currentAccountLoggedIn).setBalance(newBalance);
        System.out.println("Successfully deposited!");
        System.out.println("New balance: " + newBalance);
        System.out.println();
    }

    // Method to withdraw money
    void withdraw() {
        Scanner withScan = new Scanner(System.in);
        System.out.println("Enter the amount you would like to withdraw: ");
        float withdrawalAmount = withScan.nextFloat();
        float newBalance = customers.get(currentAccountLoggedIn).getBalance() - withdrawalAmount;
        customers.get(currentAccountLoggedIn).setBalance(newBalance);
        System.out.println("Successfully withdrawn!");
        System.out.println("New balance: " + newBalance);
        System.out.println();
    }

    // Method to print account information
    void printAccountInfo() {
        System.out.println("Printing Account Information...");
        System.out.println("Account Number: " + customers.get(currentAccountLoggedIn).getAccountNumber());
        System.out.println("Name: " + customers.get(currentAccountLoggedIn).getName());
        System.out.println("Address: " + customers.get(currentAccountLoggedIn).getAddress());
        System.out.println("Phone: " + customers.get(currentAccountLoggedIn).getPhoneNumber());
        System.out.println("Balance: " + customers.get(currentAccountLoggedIn).getBalance());
        System.out.println();
    }

    // Simulate a bank
    public static void main(String[] args) {
        System.out.println("Creating a new bank...");

        // Initialize new bank
        Bank newBank = new Bank();

        // Initialize New Customers
        Scanner bankScan = new Scanner(System.in);
        System.out.println("How many customers would you like to start with? ");
        int initNumCustomers = bankScan.nextInt();
        for (int i=0;i<initNumCustomers;i++) {
            newBank.openAccount();
        }

        System.out.println("New bank initialized with " + newBank.numCustomers + " customers...");
        System.out.println();

        // Main Page
        Scanner mainPage = new Scanner(System.in);
        int mainMenuUserChoice;
        boolean quitMain = false;
        do {
            System.out.println("Welcome to the Bank!");
            if (newBank.loggedIn) {
                System.out.println("Current Account: ");
                System.out.println("Number: " + newBank.customers.get(newBank.currentAccountLoggedIn).getAccountNumber() + " Name: " + newBank.customers.get(newBank.currentAccountLoggedIn).getName());
            }
            else {
                System.out.println("Current Account: none");
            }
            System.out.println("1. New Account");
            System.out.println("2. Login");
            System.out.println("3. Operations");
            System.out.println("4. Exit");
            mainMenuUserChoice = mainPage.nextInt();
            switch (mainMenuUserChoice) {
                case 1:
                    // Create a new account
                    System.out.println("Create a new account");
                    System.out.println();
                    newBank.openAccount();
                    break;
                case 2:
                    // Login
                    System.out.println("Login");
                    System.out.println();
                    if (newBank.loggedIn) {
                        System.out.println("Logging out of account number " + newBank.customers.get(newBank.currentAccountLoggedIn).getAccountNumber() + "...");
                    }
                    newBank.loggedIn = false;
                    newBank.login();
                    break;
                case 3:
                    // Operations page
                    // If not already logged in
                    if (!newBank.loggedIn) {
                        System.out.println("Please login before performing account operations...");
                        newBank.login();
                        // If logged in after attempt
                        if (newBank.loggedIn) {
                            Scanner operationsPage = new Scanner(System.in);
                            int operationsMenuUserChoice;
                            boolean quitOperations = false;
                            do {
                                System.out.println("Operations Menu");
                                System.out.println("1. Change Password");
                                System.out.println("2. Deposit");
                                System.out.println("3. Withdraw");
                                System.out.println("4. View Account Information");
                                System.out.println("5. Exit");
                                operationsMenuUserChoice = operationsPage.nextInt();
                                switch (operationsMenuUserChoice) {
                                    case 1:
                                        // Change Password
                                        System.out.println("Change Password");
                                        System.out.println();
                                        newBank.changePassword();
                                        break;
                                    case 2:
                                        // Deposit Money
                                        System.out.println("Deposit Money");
                                        System.out.println();
                                        newBank.deposit();
                                        break;
                                    case 3:
                                        // Withdraw Money
                                        System.out.println("Withdraw Money");
                                        System.out.println();
                                        newBank.withdraw();
                                        break;
                                    case 4:
                                        // View Account Information
                                        System.out.println("View Account Information");
                                        System.out.println();
                                        newBank.printAccountInfo();
                                        break;
                                    case 5:
                                        // Exit to main page
                                        System.out.println("Exiting to main menu...");
                                        System.out.println();
                                        quitOperations = true;
                                        break;
                                    default:
                                        System.out.println("Wrong choice. Try again.");
                                        break;
                                }
                                System.out.println();
                            } while (!quitOperations);
                        }
                    }
                    // If already logged in
                    else {
                        Scanner operationsPage = new Scanner(System.in);
                        int operationsMenuUserChoice;
                        boolean quitOperations = false;
                        do {
                            System.out.println("Operations Menu");
                            System.out.println("Current Account: ");
                            System.out.println("Number: " + newBank.customers.get(newBank.currentAccountLoggedIn).getAccountNumber() + " Name: " + newBank.customers.get(newBank.currentAccountLoggedIn).getName());
                            System.out.println("1. Change Password");
                            System.out.println("2. Deposit");
                            System.out.println("3. Withdraw");
                            System.out.println("4. View Account Information");
                            System.out.println("5. Exit");
                            operationsMenuUserChoice = operationsPage.nextInt();
                            switch (operationsMenuUserChoice) {
                                case 1:
                                    // Change Password
                                    System.out.println("Change Password");
                                    System.out.println();
                                    newBank.changePassword();
                                    break;
                                case 2:
                                    // Deposit Money
                                    System.out.println("Deposit Money");
                                    System.out.println();
                                    newBank.deposit();
                                    break;
                                case 3:
                                    // Withdraw Money
                                    System.out.println("Withdraw Money");
                                    System.out.println();
                                    newBank.withdraw();
                                    break;
                                case 4:
                                    // View Account Information
                                    System.out.println("View Account Information");
                                    System.out.println();
                                    newBank.printAccountInfo();
                                    break;
                                case 5:
                                    // Exit to main page
                                    System.out.println("Exiting to main menu...");
                                    System.out.println();
                                    quitOperations = true;
                                    break;
                                default:
                                    System.out.println("Wrong choice. Try again.");
                                    break;
                            }
                            System.out.println();
                        } while (!quitOperations);
                    }
                    break;
                case 4:
                    // Exit
                    System.out.println("Exiting the bank...");
                    System.out.println();
                    quitMain = true;
                    break;
                default:
                    System.out.println("Wrong choice. Try again.");
                    break;
            }
        } while (!quitMain);
        System.out.println("Bye! Come back again for all your banking needs!");

    }

}
