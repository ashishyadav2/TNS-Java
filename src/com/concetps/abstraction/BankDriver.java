package com.concetps.abstraction;

import java.util.Scanner;

public class BankDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // bank interface = bank implementation
        Bank bank = new BankImpl();// dynamic binding
        Account account = new Account(100,"ashish",1200000d,bank);
        bank.deposit(account,8500);
        bank.withdraw(account,980000);
    }
}
