package com.company.Bank;

public class Bank {

    private int counter=0;
    private Owner[] owners = new Owner[2];
    private Bank() {

    }
    public void registerBankAccount(BankAccount account) {
        if (counter+1 > owners.length) {
            dubleazaArray();
        }
        System.out.println("New bank account " + account.getId());
        owners[counter] = account;
        counter++;
        System.out.println(counter);
    }

    private void dubleazaArray() {
        Owner[] nouArray = new Owner[owners.length * 2];

        for (int i = 0; i < owners.length; i++) {
            nouArray[i] = owners[i];
        }
        owners = nouArray;
    }

    public void deleteBankAccount(BankAccount account) {
        int i = findId(account);
        if (i == -1) {
            System.out.println("Cont inexistent " + account.getId());
            return;
        }
        for (int j = i; j < counter - 1; j++) {
            owners[j] = owners[j + 1];
        }
        System.out.println("S-a efectuat stergerea contului " + account.getId());
        owners[counter - 1] = null;
        counter--;

        System.out.println(counter);

    }

    public int findId(BankAccount account) {
        for (int i = 0; i < counter; i++) {
            if(account.getId()==owners[i].getId()) {
                return i;
            }
        }
        return -1;
    }

    public int getNrConturi() {
        return counter;
    }

}
