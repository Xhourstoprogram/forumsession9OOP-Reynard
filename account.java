package com.OOP;

public class account {
    private Double balance;
    public account(Double balance){
        this.balance = balance;
    }
    public Double getBalance(){
        return this.balance;
    }
    public Boolean deposit(Double amt){
        if (amt > 0){
            this.balance += amt;
            return true;
        }
        else{
            return false;
        }
    }
    public Boolean withdraw(Double amt){
        if (this.balance < amt){
            return false;
        }
        else{
            this.balance -= amt;
            return true;
        }
    }
}