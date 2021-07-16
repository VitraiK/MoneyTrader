package com.company;

public class CashAccount {
    private int id;
    private int balance;

    CashAccount(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    public boolean transfer(CashAccount receiver, int amount) { //TODO: rename sender and
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            receiver.balance += amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdrawal(int detection) {
        if (detection > 0 && balance >= detection) {
            balance -= detection;
            return true;
        } else {
            return false;
        }
    }


}
