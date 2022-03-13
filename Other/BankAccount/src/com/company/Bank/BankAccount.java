package com.company.Bank;

public class BankAccount implements Owner {

    private static int counter = 1;

    private int Id;

    private string ownerName;

    private double sold;

    private Currency currency;




    public BankAccount(Currency currency) {

        counter++;

        Id = counter;

        this.currency = currency;

    }

    public void depositMoney (double sum) {

        this.sold += sum;

    }

    public void depositMoney (double sum, Currency currency) {

        switch (currency) {

            case RON: sum/=4.16;
                break;
            case EUR: sum*=1.14;
                break;
            case YEN: sum/=107.31;
                break;
            default: sum=sum;
                break;

        }

        this.sold += sum;

    }

    public void withdrawMoney (double sum) {

        this.sold -= sum;

    }

    public void withdrawMoney (double sum, Currency currency) {

        switch (currency) {

            case RON: sum/=4.16;
                break;
            case EUR: sum*=1.14;
                break;
            case YEN: sum/=107.31;
                break;
            default: sum=sum;
                break;

        }

        this.sold -= sum;

    }

    public double getSold() {
        return sold;
    }

    public int getId() {
        return Id;
    }

    public string getOwnerName() {
        return OwnerName;
    }

    public Currency getCurrency() {
        return currency;
    }

    public String toString() {
        return "BankAccount{" +
                "id=" + Id +
                ", sold=" + sold +
                ", OwnerName=" + OwnerName +
                ", Currency=" + Currency +
                '}';
    }

}
