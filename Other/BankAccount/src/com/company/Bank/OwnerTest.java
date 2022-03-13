package com.company.Bank;

public class OwnerTest implements Owner {

    private static int counter = 0;

    private final int Id;

    public OwnerTest {
        counter++;
        Id=counter;
    }

    public int getId() {
        return Id;
    }

    public double getSold() {
        return 0;
    }

    public string getOwnerName() {
        return null;
    }

    public Currency currency() {
        return null;
    }
}
