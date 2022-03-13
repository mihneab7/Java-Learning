package com.company.Bank;

import java.util.Arrays;
import com.company.Bank;

public class Main {

    public static void main(String[] args) {
        Owner o1 = new OwnerTest();
        Owner o2 = new OwnerTest();
        Owner o3 = new OwnerTest();
        Owner o4 = new OwnerTest();


        Bank.registerBankAccount(o1);
        Bank.registerBankAccount(o2);
        Bank.registerBankAccount(o3);

        Owner o5 = new OwnerTest();
        Bank.deleteBankAccount(o4);
        Bank.deleteBankAccount(o1);

        BankAccount o6 = new BankAccount(Currency.YEN);
        System.out.println(o6);
        o6.depositMoney(100);


        System.out.println(o6.toString());

        o6.depositMoney(50, Currency.EUR);

        System.out.println(o6);

        o6.withdrawMoney(6);

        System.out.println(o6);


        o6.withdrawMoney(4554, Currency.USD);
        System.out.println(o6);
        System.out.println(getNrConturi());
    }
}
