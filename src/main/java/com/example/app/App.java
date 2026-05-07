package com.example.app;

public class App {

    public static void main(String[] args) {

        int balance = 5000;

        System.out.println("Initial Balance: " + balance);

        balance = deposit(balance, 2000);
        System.out.println("Deposited: 2000");

        balance = withdraw(balance, 1000);
        System.out.println("Withdrawn: 1000");

        System.out.println("Final Balance: " + balance);
    }

    public static int deposit(int balance, int amount) {
        return balance + amount;
    }

    public static int withdraw(int balance, int amount) {
        return balance - amount;
    }
}
