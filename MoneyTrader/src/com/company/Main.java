package com.company;

public class Main {

    public static void main(String[] args) {
        CashAccount firstCashAccount = new CashAccount(32165, 3000);
        CashAccount secondCashAccount = new CashAccount(65206, 1000);
        System.out.println(firstCashAccount.getBalance()+" "+secondCashAccount.getBalance());
        transfer(firstCashAccount, secondCashAccount, 300);
        isWithdrawal(firstCashAccount, 300);
        System.out.println(firstCashAccount.getBalance()+"\n"+secondCashAccount.getBalance());
    }

    public static void transfer(CashAccount firstCashAccount, CashAccount secondCashAccount, int detection) {
        if (firstCashAccount.transfer(secondCashAccount, detection)) {
            System.out.println("Transfer from the " + firstCashAccount.getId() + " to " + secondCashAccount.getId() + " Completed\n" +
                    "Your balance: " + firstCashAccount.getBalance());
        } else {
            System.out.println("Operation failed");
        }
    }

    public static void isWithdrawal(CashAccount firstCashAccount, int detection) {
        if (firstCashAccount.withdrawal(detection)) {
            System.out.println("Cash withdrawal from: " + firstCashAccount.getId() + " Completed\n" +
                    "Your balance: " + firstCashAccount.getBalance());
        } else {
            System.out.println("Operation failed");
        }
    }
}
