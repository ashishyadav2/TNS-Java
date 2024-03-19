package com.concetps.abstraction;

public class BankImpl implements Bank{
    @Override
    public void deposit(Account account, double amount) {
        if(amount>Deposit_Limit) {
            System.err.println("Deposit limit exceeds");
        }
        else {
            account.setBalance(account.getBalance()+amount);
            System.out.println("Rs. "+amount+" has been deposited to account no." +account.getAccountNo()+ " Current Bal: "+account.getBalance());
        }
    }

    @Override
    public void withdraw(Account account, double amount) {
        if((account.getBalance()-amount)>=Min_Bal) {
            account.setBalance(account.getBalance()-amount);
            System.out.println("Rs "+amount+" withdrawn from account no "+account.getAccountNo()+ " Current Bal: "+account.getBalance());
        }
        else {
            System.out.println("Insufficient Balance!");
        }
    }
}
