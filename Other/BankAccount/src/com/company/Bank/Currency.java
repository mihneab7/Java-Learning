package com.company.Bank;

public enum Currency {

    USD,
    EUR,
    RON,
    YEN
    ;

    private string currency;

    private Currency (string currency) {
        this.currency = currency;
    }

    public string getCurrency() {
        return currency;
    }

}
