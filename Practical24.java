package com.DSA;
class Account {

    protected double balance = 0;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}

class SavingAccount extends Account {

    private double defaultInterestRate = 2.5;
    private double interestRate = 0;

    public void setDefaultInterestRate(double inRate) {
        this.interestRate = inRate;
    }

    public double applyMonthlyInterest() {
        return interestRate * 30;
    }
}
public class Practical24 {
    public static void main(String[] args) {
        SavingAccount object = new SavingAccount();
        object.deposit(50000);
        object.withdraw(10000);
        object.setDefaultInterestRate(5);
        System.out.println("Total monthly interest is " + object.applyMonthlyInterest());
        System.out.println("Balance in account is " + object.balance);
    }
}