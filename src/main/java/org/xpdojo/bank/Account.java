package org.xpdojo.bank;


public class Account {
    private int balance;

    public void Account(){
        balance = 0;
    }
    public int balance(){
        return balance;
    }

    public int deposit(int amount) throws Exception {
        if(amount < 0){
            throw new IllegalArgumentException();
        }
        balance +=amount;
        return balance;
    }

    public int withdraw(int amount) throws Exception {
        if( balance < amount){
            throw new IllegalArgumentException();
        }
        balance -=amount;
        return balance;
    }
}
