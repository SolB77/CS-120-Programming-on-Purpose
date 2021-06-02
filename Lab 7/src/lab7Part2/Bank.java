package lab7Part2;

import java.util.Scanner;

public class Bank {

    int mainMenuPage = 0;
    int operationMenuPage = 0;

    public static void main(String[] args) {
        Scanner bankScan = new Scanner(System.in);
        System.out.println("How many customers would you like to start with? ");
        int numCustomers = bankScan.nextInt();
        Customer Customers[] = new Customer[numCustomers];
        for (int i=0;i<Customers.length;i++) {
            Customers[i] = new Customer();
            Customers[i].openAccount();
        }
    }
}
