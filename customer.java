package com.OOP;

public class customer {
    private String firstname;
    private String lastname;
    private account Account;
    public customer(String f, String l){
        this.firstname = f;
        this.lastname = l;
        this.Account = new account(0.0);
    }
    public String getFirstname(){
        return this.firstname;
    }
    public String getLastname(){
        return this.lastname;
    }
    public account getAccount(){
        return this.Account;
    }
    public void setAccount(account acct){
        this.Account = acct;
    }
}